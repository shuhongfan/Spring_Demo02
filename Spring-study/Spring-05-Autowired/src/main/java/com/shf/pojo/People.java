package com.shf.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

@Data
public class People {
//    Autowired直接在属性上使用即可，可以在set方式上使用
//    使用autowared我们可以不用编写set方法，前提是你的这个属性自动装配在IOC（spring）容器中
//    如果显示定义了autowired的required属性为FALSE，说明这个对象可以为null，否则不允许为空
//    如果autowired的自动装配的环境比较复杂，自动装配无法通过一个注解@Autowired完成的时候，我们可以
//    使用@Qualifier(value = XXX)去配置@autowired的使用，指定一个唯一的bean对象注入
    @Qualifier(value = "cat22")
    @Autowired(required = false)
    private Cat cat;

    @Resource(name = "dog11")
    private Dog dog;

    private String name;

    /**
     * @Resource和@Autowired的区别
     * 都是用来自动装配的，都可以放在属性字段上
     * @Autowired通过 ByType 的方式实现，可是在多个实现类的时候，byType的方式不再是唯一，而需要通过byName的方式来注入，而这个name默认就是根据变量名来的。
     * @Qualifier 注解来指明使用哪一个实现类，实际上也是通过byName的方式实现。
     * @Resource 默认通过 ByName 的方式实现，如果找不到名字，则通过 ByType 实现，
     * 如果两个都找不到就报错
     *
     */
}
