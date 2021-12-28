package com.mooc.multThread;

import org.testng.annotations.Test;

public class multThreadOnAnntion {
    //多线程注解
    @Test(invocationCount = 10)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
    }
}
