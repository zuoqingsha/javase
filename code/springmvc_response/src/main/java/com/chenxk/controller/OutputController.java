package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/17 7:41
 */
@Controller
@SessionAttributes(value = "msg")
public class OutputController {
    @RequestMapping("output1")
    public String output(Map<String,String> map){
        map.put("msg","hello,springmvc");
        System.out.println(map.getClass());
        return "success";
    }

    @RequestMapping("/output2")
    public String output1(Model model){
        model.addAttribute("msg","hello,springmvc");
        System.out.println(model.getClass());
        return "success";
    }

    @RequestMapping("/output3")
    public String output2(ModelMap modelMap){
        modelMap.addAttribute("msg","hello,springmvc");
        System.out.println(modelMap.getClass());
        return "success";
    }

    @RequestMapping("/mv")
    public ModelAndView mv(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        mv.addObject("msg","hello.modelAndView");
        System.out.println(mv.getClass());
        return mv;
    }
}
