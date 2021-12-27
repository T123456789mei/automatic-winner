package com.mooc.suite;

import org.testng.annotations.Test;

public class IgnoerTest {
    @Test
    public void ignoerTest1(){
        System.out.println("ignoerTest1执行");
    }

    @Test(enabled = false)
    public void ignoerTest2(){
        System.out.println("ignoerTest2执行");
    }

    @Test(enabled = true)
    public void ignoerTest3(){
        System.out.println("ignoerTest3执行");
    }
}
