package com.zjq.test;

import org.testng.annotations.Test;

/**
 * 期望
 */

public class ExpectException {

    //失败的异常测试

//    @Test(expectedExceptions = RuntimeException.class)
//    public void runTimeExceptionFaild(){
//
//        System.out.println("这是一个失败的异常测试");
//    }

    //成功的测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){

        System.out.println("只是一个异常测试");
        throw new RuntimeException();
    }
}
