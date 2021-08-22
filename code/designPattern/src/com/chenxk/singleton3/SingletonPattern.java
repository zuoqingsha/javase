package com.chenxk.singleton3;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 19:38
 */
public class SingletonPattern {
//    private static SingletonPattern singletonPattern = null;
    private static final SingletonPattern singletonPattern = new SingletonPattern();
    private SingletonPattern(){

    }

    public synchronized static SingletonPattern getInstance(){
/*        if(this.singletonPattern == null){
            this.singletonPattern = new SingletonPattern();
        }*/
        return singletonPattern;
    }
}
