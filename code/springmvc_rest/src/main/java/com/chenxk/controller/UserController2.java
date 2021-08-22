package com.chenxk.controller;

import com.chenxk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 19:05
 */
@Controller
public class UserController2 {

    @RequestMapping(value = "/testUser",method = RequestMethod.POST)
    public String testUser(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/api")
    public String servletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        request.setAttribute("requestParam","request");
        session.setAttribute("sessionParam","session");
        return "success";
    }

}
