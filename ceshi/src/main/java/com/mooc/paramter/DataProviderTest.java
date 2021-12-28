package com.mooc.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "date")
    public void testDataProvider(String name,int age){
        System.out.println("testDataProvider name "+ name+";age " + age);
    }

    @DataProvider(name = "date")
    public Object[][] providerData(){
        Object[][] o = new Object[] [] {
                {"zhangsan",10},
                {"lisi",30},
                {"wangwu",34}
        };
        return o;
    }


    @Test(dataProvider = "MethodDatas")
    public void test1(String name,int age){
        System.out.println("test1 name "+ name+";age " + age);
    }

    @Test(dataProvider = "MethodDatas")
    public void test2(String name,int age){
        System.out.println("test2 name "+ name+";age " + age);
    }

    @DataProvider(name = "MethodDatas")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
             result = new Object[][]{
                    {"zhouwu",13},
            };

        }else if (method.getName().equals("test2")){
                result = new Object[][]{
                        {"zhangwang",23}
                };
            }
        return result;
    }


}
