package com.chenxk.why;

import java.util.ArrayList;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 20:00
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan",14,67));
        list.add(new Student("lisi",13,89));
        list.add(new Student("wangwu",15,97));
        list.add(new Student("maliu",12,63));
        list.add(new Student("zhaoqi",17,75));
        //查找年龄大于14的学生
        findByAge(list);
        System.out.println("--------------");
        findByScore(list);
    }

    public static void findByAge(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<Student>();
        for(Student stu:students){
            if(stu.getAge()>14){
                list.add(stu);
            }
        }
        for(Student student : list){

                System.out.println(student);


        }
    }

    public static void findByScore(ArrayList<Student> students){
        ArrayList<Student> list = new ArrayList<Student>();
        for(Student stu:students){
            if(stu.getScore()>75){
                list.add(stu);
            }
        }
        for(Student student : list){
            System.out.println(student);
        }
    }
}
