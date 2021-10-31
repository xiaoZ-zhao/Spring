package com.zhao.service;

import com.zhao.dao.UserDao;
import com.zhao.dao.UserDaoImpl;
import com.zhao.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
    userDao.getUser();
    }
}
