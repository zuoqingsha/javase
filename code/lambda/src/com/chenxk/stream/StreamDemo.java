package com.chenxk.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/5 22:37
 */
public class StreamDemo {
    //通过数组来生成
    static void gen1(){
        String[] strs={"a","b","c","d"};
        Stream<String> strs1 = Stream.of(strs);
        strs1.forEach(System.out::println);
    }

    static void gen2(){
        List<String> list = Arrays.asList("1","2","3","4");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

    static void gen3(){
        Stream<Integer> generate = Stream.generate(()->1);
        generate.limit(10).forEach(System.out::println);
    }

    static void gen4(){
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
        iterate.limit(10).forEach(System.out::println);
    }

    public static void main(String[] args) {
//        gen1();
//        gen2();
//        gen3();
//        gen4();

        //中间操作：如果调用方法之后返回的结果是Stream对象就意味着是一个中间操作
        Arrays.asList(1,2,3,4,5).stream().filter((x)->x%2==0).forEach(System.out::println);
        //求出结果集中所有偶数的和
        int count = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(count);

        //求集合中的最大值
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> max = list.stream().max((a,b)->a-b);
        System.out.println(max.get());
        //求集合中的最小值
        System.out.println(list.stream().min((a,b)->a-b).get());

        System.out.println("------------------------------------");
        Optional<Integer> any = list.stream().filter(x -> x % 2 == 0).findAny();
        System.out.println(any.get());

        Optional<Integer> first = list.stream().filter(x -> x % 2 == 0).findFirst();
        System.out.println(first.get());

        //获取最大值和最小值但是不是使用min和max方法
        Optional<Integer> min = list.stream().sorted().findFirst();
        System.out.println(min.get());

        Optional<Integer> max2 = list.stream().sorted((a,b)-> b-a).findFirst();
        System.out.println(max2.get());

        Arrays.asList("java","c#","c++","c").stream().sorted().forEach(System.out::println);
        Arrays.asList("java","c#","c++","c").stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);

        //将集合中的元素进行过滤的同时返回一个集合对象
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        collect.forEach(System.out::println);

        //去重操作
        Arrays.asList(1,1,2,3,3,4,5,6,7,2).stream().distinct().forEach(System.out::println);
        System.out.println("-------------------");
        Arrays.asList(1,1,2,3,3,4,5,6,7,2).stream().collect(Collectors.toSet()).forEach(System.out::println);

        //打印20-30这样的集合数据
        Stream.iterate(1,x->x+1).limit(50).skip(20).limit(10).forEach(System.out::println);
    }
}
