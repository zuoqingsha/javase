package com.chenxk.controller;

import com.chenxk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/20 7:33
 */
@Controller
public class JsonController {

    @ResponseBody
    @RequestMapping("/json")
    public List<User> json(){
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"zhangsan",12,"男",new Date(),"1234@qq.com"));
        list.add(new User(1,"zhangsan2",12,"男",new Date(),"1234@qq.com"));
        list.add(new User(1,"zhangsan3",12,"男",new Date(),"1234@qq.com"));
        return list;
    }

}
