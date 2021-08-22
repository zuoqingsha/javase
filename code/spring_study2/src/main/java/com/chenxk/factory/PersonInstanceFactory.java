package com.chenxk.factory;

import com.chenxk.bean.Person;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 9:50
 */
public class PersonInstanceFactory {
    public Person getPerson(String name){
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
