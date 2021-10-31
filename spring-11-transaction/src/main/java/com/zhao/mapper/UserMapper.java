package com.zhao.mapper;

import com.zhao.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询
    List<User> selectUser();

    //添加用户
    int addUser(User user);

    //删除
    int deleteUser(int id);
}
