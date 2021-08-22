package com.chenxk.controller;

import com.chenxk.bean.User3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/16 21:41
 */
@Controller
public class UserController3 {
    Object o1 = null;
    Object o2 = null;
    Object o3 = null;

    @RequestMapping("update3")
    public String update3(@ModelAttribute("user") User3 user, Model model){
        System.out.println(user);
        o2=model;
        System.out.println(o1 == o2);
        System.out.println(user == o3);
        return "output";
    }

    @ModelAttribute
    public void myModelAttribute(Model model){
        o1 = model;
        User3 user = new User3();
        user.setId(1);
        user.setUserName("张三");
        user.setPassword("123");
        user.setAge(18);
        model.addAttribute("user",user);
        System.out.println("modelAttribute:" + user);
        o3 = user;
    }
}
