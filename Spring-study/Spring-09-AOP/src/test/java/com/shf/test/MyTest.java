package com.shf.test;

import com.shf.service.UserService;
import com.shf.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //   动态代理 代理的是接口
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        //   动态代理 代理的是接口
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //   动态代理 代理的是接口
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
