package com.shf.service;

import com.shf.dao.UserDao;
import com.shf.dao.UserDaoImpl;
import com.shf.dao.UserDaoMysqlImpl;
import com.shf.dao.UserDaoOracle;

public class UserServiceImpl implements UserService{

    private UserDao userDao = new UserDaoOracle();

//    利用set进行动态实现值的注入
//    之前，程序是主动创建的对象，控制权在程序员手上
//    使用了set注入后，程序不在具有主动性，而是变成被动的接收对象
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
