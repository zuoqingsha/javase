package com.chenxk.service.impl;

import com.chenxk.dao.UserDao;
import com.chenxk.dao.impl.UserDaoImpl;
import com.chenxk.service.UserService;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/7 9:42
 */
public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
