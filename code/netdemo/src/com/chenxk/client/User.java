package com.chenxk.client;

import java.io.Serializable;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 19:55
 */
public class User implements Serializable {
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(){

    }

    private static final long serialVersionUID = 7344515790389480721L;
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
