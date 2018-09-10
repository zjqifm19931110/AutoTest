package com.zjq.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by bjzhaojianqiang on 2018/9/10.
 */
public class AutoAnnotation {

    @Test
    public void case1(){
        System.out.println("这个第一个测试用例");
    }

    @Test
    public void case2(){
        System.out.println("这个第二个测试用例");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod-----------");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("beforeMethod-----------");
    }
}
