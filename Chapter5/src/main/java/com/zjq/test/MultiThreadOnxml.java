package com.zjq.test;

import org.testng.annotations.Test;

public class MultiThreadOnxml {

    @Test
    public void test1(){
        System.out.println("Thread ID : " +
                Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("Thread ID : " +
                Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println("Thread ID : " +
                Thread.currentThread().getId());
    }
}
