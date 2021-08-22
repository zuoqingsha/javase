package com.chenxk.dao.impl;

import com.chenxk.dao.UserDao;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/7 9:47
 */
public class MySqlUserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从MySql中获取用户");
    }
}
