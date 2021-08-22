package com.chenxk.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 16:24
 */
@Repository
public abstract class BaseDao<T> {

    public abstract void save();
}
