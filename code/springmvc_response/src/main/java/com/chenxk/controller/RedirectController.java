package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/17 20:33
 */
@Controller
public class RedirectController {
    @RequestMapping("/redirect01")
    public String redirect(){
        System.out.println("redirect");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/redirect02")
    public String redirect2(){
        System.out.println("redirect02");
        return "redirect:/redirect01";
    }
}
