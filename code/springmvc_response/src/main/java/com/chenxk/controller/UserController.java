package com.chenxk.controller;

import com.chenxk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/17 20:06
 */
@Controller
public class UserController {

    Object o1 = null;
    Object o2 = null;
    Object o3 = null;

    @RequestMapping("/update")
    public String update(@ModelAttribute("user") User user, Model model){

        System.out.println(user);
        o2 = model;
        //
        System.out.println(o1 == o2);

        System.out.println(user == o3);
        return "output";
    }

    @ModelAttribute
    public void myModelAttribute(Model model){
        o1=model;
        User user = new User();
        user.setId(1);
        user.setName("里斯");
        user.setAge(18);
        user.setPassword("456");
        model.addAttribute("user",user);
        System.out.println("modelAttribute:"+user);
        o3=user;
    }
}
