package com.chenxk.factory;

import com.chenxk.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 10:05
 */
public class MyFactoryBean implements FactoryBean<Person> {
    /**
     * 工厂方法，返回需要创建的对象
     * @return
     * @throws Exception
     */
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("王五");
        return person;
    }

    /**
     * 返回创建对象的类型，spring会自动调用该方法返回对象的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }


    /**
     * 返回创建的对象是否是单例模式
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
