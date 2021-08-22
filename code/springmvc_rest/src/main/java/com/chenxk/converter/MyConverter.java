package com.chenxk.converter;

import com.chenxk.bean.User3;
import org.springframework.core.convert.converter.Converter;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/16 22:39
 */
public class MyConverter implements Converter<String, User3> {
    public User3 convert(String s) {
        User3 user = null;
        String[] split = s.split("-");
        if (s!=null && split.length==3){
            user = new User3();
            user.setId(Integer.parseInt(split[0]));
            user.setUserName(split[1]);
            user.setAge(Integer.parseInt(split[2]));
        }
        return user;
    }
}
