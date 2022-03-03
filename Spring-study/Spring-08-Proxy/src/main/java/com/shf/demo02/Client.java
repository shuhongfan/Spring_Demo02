package com.shf.demo02;

import org.junit.Test;

public class Client {
    @Test
    public void test1(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.add();
    }

    @Test
    public void test2(){
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
