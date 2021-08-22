package com.chenxk.pc4;

import java.util.concurrent.BlockingQueue;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/31 16:15
 */
public class ConsumerQueue implements Runnable {
    private BlockingQueue<Goods> blockingQueue;

    public ConsumerQueue(BlockingQueue blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            try {
                Goods goods = blockingQueue.take();
                System.out.println("消费者消费的商品是："+goods.getBrand()+"--"+goods.getName());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
