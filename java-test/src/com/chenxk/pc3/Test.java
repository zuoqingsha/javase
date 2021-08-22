package com.chenxk.pc3;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/29 22:49
 */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
    }
}
