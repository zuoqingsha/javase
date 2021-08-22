package com.chenxk.Test;

import com.chenxk.dao.impl.MySqlUserDaoImpl;
import com.chenxk.dao.impl.UserDaoImpl;
import com.chenxk.service.UserService;
import com.chenxk.service.impl.UserServiceImpl;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/7 9:45
 */
public class Test {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new MySqlUserDaoImpl());
        userService.getUser();
        System.out.println("------------");
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
