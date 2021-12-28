package com.mooc.multThread;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class MultiTheadOnXml {
    @Test(groups = "server")
    public void test1(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("这是服务端测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("这是服务端测试方法2");
    }
    @Test(groups = "srever")
    public void test3(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("这是服务端测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("这是客户端测试方法5");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("BeforeGroups这是服务端方法运行之前运行的");
    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("AfterGroups这是服务端方法运行之后运行的");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("BeforeGroups这是客户端方法运行之前运行的");
    }

    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());
        System.out.println("AfterGroups这是客户端方法运行之后运行的");
    }

}
