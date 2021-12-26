package com.mooc.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("BeforeSuite运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("AfterSuite运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

}
