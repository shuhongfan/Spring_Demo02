package com.shf.pojo;

import lombok.Data;

@Data
public class User {
    private String name;

//    默认使用无参构造创建对象
    public User() {
        System.out.println("User的无参构造");
    }

    public User(String name) {
        System.out.println("User的 有 参构造");
        this.name = name;
    }

    public void show(){
        System.out.println("你的名字是："+name);
    }
}
