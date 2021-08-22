package com.chenxk.controller;

import com.chenxk.bean.Person;
import com.sun.istack.internal.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/18 21:07
 */
@Controller
public class ValidationController {
    @Validated
    @RequestMapping("/testValidation")
    public String validate(@Valid Person person, BindingResult bindingResult, Model model){
        System.out.println(person);
        Map<String,Object> map = new HashMap<String, Object>();
        if(bindingResult.hasErrors()){
            System.out.println("登录失败");
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getField());
                System.out.println(fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            model.addAttribute("errors",map);
            return "forward:login.jsp";
        }else {
            System.out.println("登录成功！");
            return "success";
        }
    }
}
