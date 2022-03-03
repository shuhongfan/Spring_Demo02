package com.shf.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *  @Component 有几个衍生注解，我们在web开发中，会按照mvc三层架构分层！
 *
 *  dao     @Repository
 *  service  @Service
 *  controller  @Controller
 *
 */


//@Component  组件
@Component //等价于   <bean id="user" class="com.shf.pojo.User"/>
@Data
@Scope
public class User {

    @Value("shf") // 等价于 <property name="name" value="shf"/>
    public String name;
}
