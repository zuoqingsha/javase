package com.chenxk.test;

import com.chenxk.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/7 13:03
 */

//容器中的person对象是什么时候创建
//容器中的对象在容器创建完成之前就已经把对象创建
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person) context.getBean("person");
        //以下方式获取对象的时候不需要强制类型转换
        Person person1 = context.getBean("person",Person.class);
        System.out.println(person);
    }
}
