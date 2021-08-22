package com.chenxk.lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/4 7:05
 */
public class LambdaTest {
    public static void main(String[] args) throws Exception {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running......");
//            }
//        };
//        runnable.run();
//
//        Runnable runnable2 = ()->{
//            System.out.println("running2....");
//        };
//        runnable2.run();
//
//        Runnable runnable3 = ()-> System.out.println("running3......");
//        runnable3.run();
//
//        Callable<String> c1 = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                return "chenxk";
//            }
//        };
//        System.out.println(c1.call());
//
//        Callable<String> c2 = ()->{return  "chenxk";};
//
//        Callable<String> c3 = ()->"chenxk";

//        StudentDao s1 = new StudentDao() {
//            @Override
//            public void insert(Student student) {
//                System.out.println("插入学生1");
//            }
//        };
//        StudentDao s2 = (student)->{
//            System.out.println("student:"+student);
//        };
//
//        StudentDao s3 = (student)-> System.out.println("student:"+student);
//
//        s1.insert(new Student());
//        s2.insert(new Student());
//        s3.insert(new Student());
//
//        TeacherDao t1 = new TeacherDao() {
//            @Override
//            public int get(Teacher teacher) {
//                return 1;
//            }
//        };
//
//        TeacherDao t2 = (teacher)->{return 2;};
//        TeacherDao t3 = (teacher)-> 3;
//        TeacherDao t4 = (Teacher teacher)->4;
//
//        System.out.println(t1.get(new Teacher()));
//        System.out.println(t2.get(new Teacher()));
//        System.out.println(t3.get(new Teacher()));
//        System.out.println(t4.get(new Teacher()));

        /*
        * 在java中提供了一系列的函数式接口，用来接受后续传入的逻辑，但是对输入和输出有要求
        *
        * */
        Function<String,Integer> f1 = (str)->{return str.length();};
        System.out.println(f1.apply("abcdefg"));

        Supplier<String> s1 = ()->{return "chenxk";};
        Supplier<String> s2 = ()->"chenxk2";
        System.out.println(s1.get());
        System.out.println(s2.get());

        Consumer<String> c1 = (str)-> System.out.println(str);
        c1.accept("chenxk3");
        System.out.println("---------------");

        BiFunction<String,String,Integer> bf = (a,b)->a.length()+b.length();
        System.out.println(bf.apply("陈显锟","你好"));

//        Runnable runnable1 = ()->get();
//        Runnable runnable2 = ()->find();
//        Runnable runnable3 = ()->100;
//        Runnable runnable4 = ()->"";
//        runnable1.run();

        LambdaInterface l1 = ()->get();
//        LambdaInterface l2 = ()->find();
//        LambdaInterface l3 = ()->"abc";
        LambdaInterface l4 = ()-> true?1:0;
        System.out.println(l1.get());

        List<String> list = Arrays.asList("a","b","c","d");
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("------------------");
        list.forEach(System.out::println);
    }

    static int get(){
        return 1;
    }

    static String find(){
        return "find";
    }

    static void exec(){
        find();
    }
}
