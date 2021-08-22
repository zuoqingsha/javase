package com.chenxk.why3;

import com.chenxk.why.Student;
import com.chenxk.why2.AgeFilter;
import com.chenxk.why2.ScoreFilter;
import com.chenxk.why2.StudentFilter;

import java.util.ArrayList;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 20:38
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan",14,67));
        list.add(new Student("lisi",13,89));
        list.add(new Student("wangwu",15,97));
        list.add(new Student("maliu",12,63));
        list.add(new Student("zhaoqi",17,75));
        getByFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getScore()>75;
            }
        });
        System.out.println("-------------");
        getByFilter(list, new StudentFilter() {
            @Override
            public boolean compare(Student student) {
                return student.getAge()>14;
            }
        });
    }

    public static void getByFilter(ArrayList<Student> students, StudentFilter studentFilter){
        ArrayList<Student> list = new ArrayList<Student>();
        for(Student stu : students){
            if(studentFilter.compare(stu)){
                list.add(stu);
            }
        }
        printStudent(list);
    }

    public static void printStudent(ArrayList<Student> students){
        for(Student student : students){
            System.out.println(student);
        }
    }
}

