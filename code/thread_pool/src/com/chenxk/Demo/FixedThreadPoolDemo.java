package com.chenxk.Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 9:06
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0; i<20; i++){
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }
}
