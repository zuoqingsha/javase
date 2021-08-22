package com.chenxk.controller;

import com.chenxk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/17 22:58
 */
@Controller
public class MyConverterController {
    @RequestMapping("/myConverter")
    public String add(User user, Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "success";
    }
}
