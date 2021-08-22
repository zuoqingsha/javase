package com.chenxk.controller;

import com.chenxk.service.PersonService;
import com.chenxk.service.PersonService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 14:46
 */
@Controller(value = "personController02")
@Scope(value = "prototype")
public class PersonController {
    @Autowired
    @Qualifier("personService")
    private PersonService personService3;
//    private PersonService2 personService;

//    public PersonController(){
//        System.out.println("创建对象");
//    }
    public void save(){
        personService3.save();
    }
}
