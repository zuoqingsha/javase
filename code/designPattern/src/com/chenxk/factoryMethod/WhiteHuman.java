package com.chenxk.factoryMethod;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/10 12:37
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {

        System.out.println("白色人类会笑，侵略的笑");
    }

    @Override
    public void cry() {

        System.out.println("白色人类会哭");

    }

    @Override
    public void talk() {

        System.out.println("白色人类会说话，一般都是单字节");

    }
}
