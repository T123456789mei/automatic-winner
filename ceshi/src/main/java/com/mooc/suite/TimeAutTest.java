package com.mooc.suite;

import org.testng.annotations.Test;
//超时测试
public class TimeAutTest {
    @Test(timeOut = 3000)
    public void testSuccess()throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFaill()throws InterruptedException{
        Thread.sleep(3000);
    }

    @Test(timeOut = 2000)
    public void te1tFaill()throws InterruptedException {
        Thread.sleep(3000);
    }
}
