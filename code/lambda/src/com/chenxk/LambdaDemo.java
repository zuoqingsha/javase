package com.chenxk;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 7:33
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("running.......");
            }
        });
        thread.start();

        new Thread(()->{System.out.println("running2.......");}).start();

        List<String> list = Arrays.asList("java","javascript","scala","python");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        for(String str:list){
            System.out.println(str);
        }

        Collections.sort(list,(a,b)->a.length()-b.length());
        list.forEach(System.out::println);
    }
}
