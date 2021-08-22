package com.chenxk.controller;

import com.chenxk.bean.User;
import com.chenxk.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 13:50
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String save(){
        System.out.println(this.getClass().getName()+"save");
        userDao.save(new User());
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String update(Integer id){
        System.out.println(this.getClass().getName()+"update");
        userDao.update(id);
        return "redirect:/success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    public String delete(Integer id){
        System.out.println(this.getClass().getName()+"delete");
        userDao.delete(id);
        return "redirect:/success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String query(){
        System.out.println(this.getClass().getName()+"query");
        userDao.query();
        return "success";
    }

    @RequestMapping(value = "/success")
    public String success() {
        return "success";
    }
}
