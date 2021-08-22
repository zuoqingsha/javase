package com.chenxk.singleton1;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 19:35
 */
public class Minister {
    public static void main(String[] args) {
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();

        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();
    }
}
