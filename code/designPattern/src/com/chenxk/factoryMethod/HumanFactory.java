package com.chenxk.factoryMethod;

import java.util.List;
import java.util.Random;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/10 12:43
 */
public class HumanFactory {
    //定义一个烤箱，泥巴塞进去，人出来
    public static Human createHuman(Class c){

        Human human = null; //定义一个类型的人类
        try{
            human = (Human)Class.forName(c.getName()).newInstance();  //产生一个人类

        }catch (InstantiationException e){
            System.out.println("必须指定人类颜色");

        }catch (IllegalAccessException e){
            System.out.println("人类定义错误");
        }catch (ClassNotFoundException e){
            System.out.println("指定的人类找不到");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null;

        //首先获得有多少个实现类
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());

        human = createHuman(concreteHumanList.get(rand));

        return human;
    }
}
