package com.shf.test;

import com.shf.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
//        获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        我们的对象现在都在spring中管理了，我们要使用，直接去里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
