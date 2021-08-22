package com.chenxk.controller;

import com.chenxk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/18 20:49
 */
@Controller
public class DataConverterController {
    @RequestMapping("/testDateConverter")
    public String testDateConverter(User user){
        System.out.println(user);
        return "success";
    }
}
