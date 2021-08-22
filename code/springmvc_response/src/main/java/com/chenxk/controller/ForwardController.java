package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/17 20:29
 */
@Controller
public class ForwardController {
    @RequestMapping("/forward01")
    public String forward(){
        System.out.println("1");
        return "forward:/index.jsp";
    }
    @RequestMapping("/forward02")
    public String forward2(){
        System.out.println("2");
        return "forward:/forward01";
    }
}
