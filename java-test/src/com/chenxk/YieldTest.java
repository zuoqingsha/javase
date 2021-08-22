package com.chenxk;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/29 7:20
 */
public class YieldTest {
    public static void main(String[] args) {
        MyRun run = new MyRun();
        Thread t = new Thread(run);
        t.start();
        for(int i = 0; i < 5; i++){
            if(i==2){
                Thread.yield();
                System.out.println(Thread.currentThread().getName()+"======"+i+"礼让一次");
            }else{
                System.out.println(Thread.currentThread().getName()+"======"+i);
            }

        }
    }
}
