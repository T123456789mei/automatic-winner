package com.mooc.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void ParamterTest1(String name,int age){
        System.out.println("姓名："+name + ";年龄：" +age);

    }
}
