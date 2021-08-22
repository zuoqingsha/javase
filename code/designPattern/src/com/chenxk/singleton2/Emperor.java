package com.chenxk.singleton2;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/9 19:45
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;  //最多只能有两个皇帝
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);  //皇帝叫什么
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);  //装皇帝的列表
    private static int countNumOfEmperor = 0;  //正在被人尊称的是哪个皇帝

    //先把2个皇帝产生出来
    static{
       //把所有的皇帝都产生出来
       for(int i = 0; i<maxNumOfEmperor; i++){
           emperorList.add(new Emperor("皇"+(i+1)+"帝"));
       }
    }

    private Emperor(){

    }

    private Emperor(String info){
        emperorInfoList.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor)emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
