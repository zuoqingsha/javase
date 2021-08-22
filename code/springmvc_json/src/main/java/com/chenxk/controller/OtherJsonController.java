package com.chenxk.controller;

import com.chenxk.bean.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/20 7:48
 */
@Controller
public class OtherJsonController {

    @ResponseBody
    @RequestMapping("/otherjson")
    public String testResponseBody(){
        return "<h1>Success</h1>";
    }

    @RequestMapping("/testRequestBody")
    public String testResponseBody(@RequestBody String body){
        System.out.println("请求体：" + body);
        return "success";

    }

    @RequestMapping("/testRequestJson")
    public String testResponseBody(@RequestBody User user){
        System.out.println("对象：" + user);
        return "success";
    }

    @RequestMapping("/testHttpEntity")
    public String testRequestBody(HttpEntity<String> httpEntity){
        System.out.println(httpEntity);
        return "success";
    }

    @RequestMapping("/testResponseEntity")
    public ResponseEntity<String> testResponseEntity(){
        String body = "<h1>hello</h1>";
        MultiValueMap<String,String> header = new HttpHeaders();
        header.add("Set-Cookie","name=zhangsan");
        return new ResponseEntity<String>(body,header, HttpStatus.OK);
    }


}
