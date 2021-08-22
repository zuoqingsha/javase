package com.chenxk.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 17:10
 */

public class MyTest {

    @Test
    public void test01(){
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.add(1,2));
    }

    @Test
    public void test02(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Calculator calculator = context.getBean("myCalculator", Calculator.class);
        calculator.add(1,1);
        System.out.println(calculator.getClass());

    }
}
