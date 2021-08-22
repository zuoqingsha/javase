package com.chenxk.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/11 22:54
 */
@Controller
@RequestMapping("/chenxk")
public class HelloController{

//    public void hello(){
//        System.out.println(this.getClass().getName()+"---------");
//    }

    /*
     * @RequestMapping 表示用来匹配当前方法要处理的请求，其中/可以写也可以不写，一般推荐写着
     * 同时，@RequestMapping也可以用来加在类上；何时需在类上添加？
     *      当包含多个Controller，通过在不同的Controller中包含同名的请求的时候，需要添加
     */
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(Model model){
        model.addAttribute("msg","hello,springmvc");
        return "hello";
    }


}
