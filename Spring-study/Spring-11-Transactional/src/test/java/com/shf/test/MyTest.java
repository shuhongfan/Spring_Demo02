package com.shf.test;

import com.shf.mapper.UserMapper;
import com.shf.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 事物ACID原则
 * 原子性
 * 一致性
 * 隔离性：多个业务可能操作同一个资源，防止数据损坏
 * 持久性：事物一旦提交，无论系统发生什么问题，结果都不会再被影响，被持久化的写到存储器中
 *
 *
 *
 * spring中的事物管理
 */
public class MyTest {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }

    }
}
