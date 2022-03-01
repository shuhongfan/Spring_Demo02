package com.shf.dao;

public class UserDaoOracle implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Oracle获取用户数据");
    }
}
