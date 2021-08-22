package com.chenxk.dao;

import com.chenxk.bean.Dog;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/22 16:09
 */
public interface DogDao {

    public Dog selectDogById(Integer id);
}
