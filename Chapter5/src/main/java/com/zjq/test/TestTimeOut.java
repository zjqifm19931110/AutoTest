package com.zjq.test;

import org.testng.annotations.Test;

public class TestTimeOut {

    @Test(timeOut = 3000)  //单位为毫秒
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)  //单位为毫秒
    public void testFalse() throws InterruptedException{
        Thread.sleep(3000);
    }
}
