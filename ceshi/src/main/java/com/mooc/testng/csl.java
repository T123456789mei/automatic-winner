package com.mooc.testng;


import org.testng.annotations.*;

public class csl {

    @Test
    public void HelloWorld(){
        System.out.println("HelloWorld");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("BeforeMethod这是测试方法之前运行的");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("AfterMethod这是测试方法运行之后运行的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }





}
