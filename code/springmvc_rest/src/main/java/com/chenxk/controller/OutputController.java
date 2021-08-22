package com.chenxk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import sun.awt.SunHints;

import java.util.Map;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 22:44
 */
@Controller
@SessionAttributes(value = "msg")
public class OutputController {

    @RequestMapping("/output1")
    public String output1(Model model){
        model.addAttribute("msg","hello,springmvc");
        System.out.println(model.getClass());
        return "output";
    }

    @RequestMapping("/output2")
    public String output2(ModelMap modelMap){
        modelMap.addAttribute("msg","hello,springmvc");
        return "output";
    }

    @RequestMapping("/output3")
    public String output3(Map map){
        map.put("msg","hello,springmvc");
        return "output";
    }

    @RequestMapping("/mv")
    public ModelAndView mv(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("output");
        mv.addObject("msg","hello.modelAndView");
        return mv;
    }
}
