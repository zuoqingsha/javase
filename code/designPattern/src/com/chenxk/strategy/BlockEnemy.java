package com.chenxk.strategy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:39
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operator() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
