package com.shf.test;

import com.shf.dao.UserDaoMysqlImpl;
import com.shf.dao.UserDaoSqlserverImpl;
import com.shf.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
//        用户实际调用的是业务层，dao层它们不需要接触
        UserServiceImpl userService = new UserServiceImpl();

//        控制反转 IOC
//        这种思想，从本质上解决了问题，我们不用再去管理对象的创建了。
//        系统的耦合性大大降低，可以更加专注于业务的实现上
        userService.setUserDao(new UserDaoSqlserverImpl());

        userService.getUser();
    }

    @Test
    public void test2(){
//        获取ApplicationContext,拿到spring的容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        容器在手，天下我有，需要什么，就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }

}
