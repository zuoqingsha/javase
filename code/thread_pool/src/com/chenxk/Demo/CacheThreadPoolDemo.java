package com.chenxk.Demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/1 8:55
 */
public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=0; i<20; i++){
            executorService.execute(new Task());

        }
        executorService.shutdown();
    }
}
