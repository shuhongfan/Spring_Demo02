package com.shf.mapper;

import com.shf.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

//    添加一个用户
    public int addUser(User user);

//    删除一个用户
    public int deleteUser(int id);
}