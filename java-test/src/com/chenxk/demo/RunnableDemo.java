package com.chenxk.demo;

import com.sun.xml.internal.ws.streaming.TidyXMLStreamReader;
import sun.java2d.loops.GraphicsPrimitive;
import sun.nio.ch.ThreadPool;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/27 21:36
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+"=========="+i);
        }
    }
}
