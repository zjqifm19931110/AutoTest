package com.zjq.test;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test
    public void test3(){
        System.out.println("test3 run");
    }

    @Test(dependsOnMethods = {"test1","test3"})
    public void test2(){
        System.out.println("test2 run");
    }
}
