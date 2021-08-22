package com.chenxk;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/29 7:11
 */
public class SleepTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread thread = new Thread(run);
        thread.start();

        for(int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+"========="+i);
            if(i==2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
