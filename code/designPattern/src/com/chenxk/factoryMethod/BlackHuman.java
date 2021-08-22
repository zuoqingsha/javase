package com.chenxk.factoryMethod;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/10 12:39
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {

        System.out.println("黑色人类会笑");
    }

    @Override
    public void cry() {

        System.out.println("黑色人类会哭");

    }

    @Override
    public void talk() {

        System.out.println("黑色人类可以讲话，一般人听不懂");

    }
}
