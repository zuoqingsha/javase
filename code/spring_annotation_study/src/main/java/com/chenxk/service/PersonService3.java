package com.chenxk.service;

import com.chenxk.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 14:47
 */
@Service
public class PersonService3 extends PersonService {
    @Autowired
    private PersonDao personDao;
    public void save(){
        System.out.println("personService3......");
        personDao.save();
    }
    public PersonService3(){

    }
}
