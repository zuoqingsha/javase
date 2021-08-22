package com.chenxk.ticket;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/28 7:39
 */

/**
 * 此时出现的问题：
 *  1、每次在启动线程对象的时候都会创建自己对象的属性值，相当于每个线程操作自己，没有真正意义上实现共享
 *      解决方法：将共享对象，共享变量设置成static
 *  2、每次访问共享对象的时候，数据不一致
 *      解决方法：使用线程同步
 */
public class TicketThread extends Thread {

//    private int ticket = 5;
    private static int ticket = 5;

    @Override
    public void run() {
//        if(ticket>0){
//            System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
//        }
        for(int i = 0; i < 100; i++){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
            }
        }
    }

    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();

        t1.start();
        t2.start();
        t3.start();
        t4.start();



    }
}
