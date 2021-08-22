package com.chenxk.factoryMethod;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/10 12:35
 */
public class YellowHuman implements  Human {
    @Override
    public void laugh() {
        System.out.println("黄色人类会大笑！");
    }

    @Override
    public void cry() {
        System.out.println("黄色人类会哭");
    }

    @Override
    public void talk() {

        System.out.println("黄色人类会说话，一般说的是双节字");

    }
}
