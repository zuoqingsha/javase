package com.chenxk.singleton2;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 19:55
 */
public class Minister {
    public static void main(String[] args) {

        int mimisterNum = 10;

        for(int i=0; i<mimisterNum; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
