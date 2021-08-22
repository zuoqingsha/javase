package com.chenxk.dao;

import com.chenxk.bean.User;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/22 13:41
 */
public interface UserDao {

    public int insertUser(User user);

    public User selectUserById(Integer id);

    public int updateUser(User user);

    public int deleteUser(Integer id);
}
