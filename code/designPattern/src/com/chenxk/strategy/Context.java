package com.chenxk.strategy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:40
 */
public class Context {
    //构造函数，你要使用那个妙计
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    public Context(){

    }

    public void operator(){
        this.strategy.operator();
    }
}
