package com.chenxk;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/29 7:03
 */
public class MyRun implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }
}
