package com.mooc.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试方法1");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试方法2");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }
    @Test(groups = "srever")
    public void test3(){
        System.out.println("这是服务端测试方法3");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试方法5");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }
    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("BeforeGroups这是服务端方法运行之前运行的");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("AfterGroups这是服务端方法运行之后运行的");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("BeforeGroups这是客户端方法运行之前运行的");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }

    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("AfterGroups这是客户端方法运行之后运行的");
        System.out.printf("Thread Id：%s%n",Thread.currentThread().getId());

    }
}
