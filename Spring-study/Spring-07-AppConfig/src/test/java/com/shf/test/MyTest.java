package com.shf.test;

import com.shf.config.AppConfig;
import com.shf.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test1(){
//        如果完成使用了配置类方式去做,我们就只能通过AnnotationConfig上下文来获取容器,通过配置类的class对象加载
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = context.getBean("user", User.class);

        System.out.println(user);
    }
}
