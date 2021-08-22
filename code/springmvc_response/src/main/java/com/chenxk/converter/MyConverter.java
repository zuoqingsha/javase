package com.chenxk.converter;

import com.chenxk.bean.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/17 22:43
 */
public class MyConverter implements Converter<String, User> {
    public User convert(String source) {
        User user = null;
        String[] split = source.split("-");
        if (source!=null && split.length==4){
            user = new User();
            user.setId(Integer.parseInt(split[0]));
            user.setName(split[1]);
            user.setPassword(split[2]);
            user.setAge(Integer.parseInt(split[3]));
        }
        return user;
    }
}
