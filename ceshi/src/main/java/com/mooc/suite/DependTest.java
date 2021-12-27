package com.mooc.suite;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    /**
     * test1执行失败了，test2会被忽略不执行
     * 依赖测试
     */
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
