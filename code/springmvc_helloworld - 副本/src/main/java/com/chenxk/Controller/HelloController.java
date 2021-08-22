package com.chenxk.Controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/11 22:54
 */
public class HelloController implements Controller {

//    public void hello(){
//        System.out.println(this.getClass().getName()+"---------");
//    }


    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(this.getClass().getName()+"---------");
        //创建模型和试图对象
        ModelAndView mv = new ModelAndView();
        //将需要的值传递到model中
        mv.addObject("msg","hello,springmvc");
        //设置要跳转的视图
        mv.setViewName("hello");
        return mv;
    }
}
