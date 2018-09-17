package com.zjq.test.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sun.security.krb5.internal.PAData;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by bjzhaojianqiang on 2018/9/13.
 */
public class MyCookiesForPost {
    private String url;
    private ResourceBundle bundle;

    private CookieStore cookieStore;

    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        HttpGet get = new HttpGet(this.url + bundle.getString("getCookies.uri"));
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");

        this.cookieStore = client.getCookieStore();
        List<Cookie> cookieList = this.cookieStore.getCookies();
//        for (Cookie cookie : cookieList){
//            String name = cookie.getName();
//            String value = cookie.getValue();
//            System.out.println("cookie name = " + name
//                    + ";  cookie value = " + value);
//        }
    }

    @Test(dependsOnMethods = {"testGetCookies"})
    public void testPostMethod() throws IOException {
        String uri = bundle.getString("test.post.with.cookies");
        String testUrl = this.url + uri;
        //声明client参数
        DefaultHttpClient client = new DefaultHttpClient();
//      声明post方法
        HttpPost post = new HttpPost(testUrl);
//      添加参数
        JSONObject param = new JSONObject();
        param.put("name","huhansan");
        param.put("age","18");
//      设置请求信息
        post.setHeader("content-type","application/json");
//      将参数信息添加到方法中
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
//      声明一个对象存储响应结果
        String result;
//      设置Cookies信息
        client.setCookieStore(this.cookieStore);
//      执行post
        HttpResponse response = client.execute(post);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        JSONObject resultJson = new JSONObject(result);
//       判断结果值
        String success = resultJson.getString("huhansan");
        Assert.assertEquals("success",success);

    }
}
