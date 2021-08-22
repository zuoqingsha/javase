package com.chenxk.strategy;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 12:42
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        System.out.println("----------刚到吴国的时候拆第一个----------");
        context = new Context(new BackDoor());  //拿到妙计
        context.operator();  //拆开执行
        System.out.println("\n\n\n\n");

        System.out.println("----------刘备乐不思蜀了，拆第二个----------");
        context = new Context(new GivenGreenLight());
        context.operator();
        System.out.println("\n\n\n\n");

        System.out.println("----------孙权的小兵追来，拆第三个----------");
        context = new Context(new BlockEnemy());
        context.operator();
        System.out.println("\n\n\n\n");
    }
}
