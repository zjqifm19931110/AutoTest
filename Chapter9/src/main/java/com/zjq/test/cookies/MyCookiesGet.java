package com.zjq.test.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesGet {

    private String url;
    private ResourceBundle bundle;

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
        result = EntityUtils.toString(response.getEntity(),"UTF-8");

        CookieStore store = client.getCookieStore();
        List<Cookie> cookies = store.getCookies();
        System.out.println(cookies);
        for (Cookie cookie: cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println(name + ":" + value);

        }
    }
}
