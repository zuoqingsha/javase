package com.chenxk.pc4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/31 16:19
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<Goods> queue = new ArrayBlockingQueue<Goods>(5);
        ProducerQueue producerQueue = new ProducerQueue(queue);
        ConsumerQueue consumerQueue = new ConsumerQueue(queue);
        new Thread(producerQueue).start();
        new Thread(consumerQueue).start();
    }
}
