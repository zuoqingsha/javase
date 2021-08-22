package com.chenxk.singleton1;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 19:32
 */
public class Emperor {
    private static Emperor emperor = null;

    private Emperor(){

    }

    public static Emperor getInstance(){
        if(emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某。。。。。。");
    }
}
