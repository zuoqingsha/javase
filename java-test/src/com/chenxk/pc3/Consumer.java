package com.chenxk.pc3;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/7/29 22:29
 */
public class Consumer implements Runnable {

    private Goods goods;

    public Consumer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run() {

        for (int i = 0; i < 10; i++){
            goods.get();
        }

    }
}
