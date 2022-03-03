package com.shf.demo02;

//真实对象
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加了一个用户");
        System.out.println("add()");
    }

    @Override
    public void delete() {
        System.out.println("delete()");
    }

    @Override
    public void update() {
        System.out.println("update()");
    }

    @Override
    public void query() {
        System.out.println("query()");
    }
}
