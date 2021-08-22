package com.chenxk.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.chenxk.bean.Address;
import com.chenxk.bean.Person;
import javafx.scene.Parent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/7 14:58
 */
public class MyTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        //根据bean标签的id来获取对象
//        Person person = context.getBean("son",Person.class);
//        System.out.println(person);
//        Address address2 = context.getBean("address2",Address.class);
//        System.out.println(address2);

//        Person parent = context.getBean("parent",Person.class);
//        System.out.println(parent);

//        Person person1 = context.getBean("person2", Person.class);
//        Person person2 = context.getBean("person2",Person.class);
//        System.out.println(person1==person2);

//        Person person = context.getBean("person",Person.class);
//        System.out.println(person);
//
//        Person person2 = context.getBean("person2",Person.class);
//        System.out.println(person2);
//
//        Person person3 = context.getBean("factoryBean",Person.class);
//        System.out.println(person3);
//
//        Person person4 = context.getBean("person3",Person.class);
//        System.out.println(person4);
        //ApplicationContext没有close方法，需要使用具体子项
//        ((ClassPathXmlApplicationContext) context).close();

//        DruidDataSource dataSource = context.getBean("dataSource2", DruidDataSource.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getConnection());

    }
}
