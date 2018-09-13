package com.zjq.test;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import javax.swing.text.html.parser.Entity;

public class MyHttpClient {
    @Test
    public  void test1() throws Exception{

        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        HttpClient client = HttpClientBuilder.create().build();;
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

    }
}
