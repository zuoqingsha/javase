package com.chenxk.strategy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:36
 */
public class BackDoor implements IStrategy{
    @Override
    public void operator() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施压");
    }
}
