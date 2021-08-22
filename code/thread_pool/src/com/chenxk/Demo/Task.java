package com.chenxk.Demo;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 8:57
 */
public class Task implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" running");
    }
}
