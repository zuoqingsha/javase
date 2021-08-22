package com.chenxk.factoryMethod;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/10 12:51
 */
public class NvWa {

    public static void main(String[] args) {

        System.out.println("----------one----------");

        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.laugh();
        blackHuman.cry();
        blackHuman.talk();

        System.out.println("----------two----------");

        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.laugh();
        yellowHuman.cry();
        yellowHuman.talk();

        System.out.println("----------three----------");

        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.laugh();
        whiteHuman.cry();
        whiteHuman.talk();

        for(int i=0; i<200; i++){
            System.out.println("----------随机----------");
            Human human = HumanFactory.createHuman();
            human.laugh();
            human.cry();
            human.talk();
        }
    }
}
