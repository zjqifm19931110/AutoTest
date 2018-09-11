package com.zjq.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTestd {
//    @Test(dataProvider = "data")
//    public void testDataProvider(String name, int age){
//        System.out.println("name: " + name + " age:" + age);
//    }
//
//    @DataProvider(name="data")
//    public Object[][] providerData(){
//        Object[][] o = new Object[][]{
//                {"ZHANGSAN",10},
//                {"lisi", 20},
//                {"wangwu",30}
//        };
//        return o;
//    }

    @Test(dataProvider = "mdata")
    public void test1(String name, int age){
        System.out.println("test1:" +"name: " + name + " age:" + age);
    }
    @Test(dataProvider = "mdata")
    public void test2(String name, int age){
        System.out.println("test2:" + "name: " + name + " age:" + age);
    }

    @DataProvider(name="mdata")
    public Object[][] providerData1(Method method){

        Object[][] result = null;
        if (method.getName().equals("test1")){
            result= new Object[][]{
                    {"ZHANGSAN",10},
                    {"wangwu",100}
            };

        }else if(method.getName().equals("test2")){
            result= new Object[][]{
                    {"wangwu",100}
            };
        }
        ;
        return result;
    }
}
