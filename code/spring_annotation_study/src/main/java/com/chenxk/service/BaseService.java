package com.chenxk.service;

import com.chenxk.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 16:41
 */
public class BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    public void save(){
        baseDao.save();
    }
}
