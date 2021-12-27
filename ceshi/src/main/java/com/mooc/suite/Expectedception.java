package com.mooc.suite;

import org.testng.annotations.Test;

public class Expectedception {
    /**
     * 什么时候会用到异常测试
     * 在我们期望结果为一个异常的时候
     * 比如我们传入了一个不合法的参数，程序抛出了异常
     * 也就是说我的语气结果就是这个异常
     */
    //这是一个测试结果会失败的测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个测试结果会成功的测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();


    }

}
