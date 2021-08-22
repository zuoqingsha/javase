package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 16:12
 */
@Controller
public class RequestController {
    @RequestMapping("/request")
    public String request(@RequestParam(value = "username",required = false, defaultValue = "hehe") String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/header")
    public String header(@RequestHeader("User-Agent") String agent){
        System.out.println(agent);
        return "success";
    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue("JSESSIONID")String id){
        System.out.println(id);
        return "success";
    }
}
