package com.chenxk.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 10:55
 */
@Controller
public class PathVariableController {
    @RequestMapping("/testPathVariable/{id}/{name}")
    public String testPathVariable(@PathVariable("id") Integer id,@PathVariable("name") String name){
        System.out.println(name);
        System.out.println(id);
        return "hello";
    }

}
