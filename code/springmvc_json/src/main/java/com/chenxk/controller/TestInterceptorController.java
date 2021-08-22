package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/21 15:03
 */
@Controller
public class TestInterceptorController {

    @RequestMapping("/test01")
    public String test01(){
        System.out.println("test01");
        return "success";
    }
}
