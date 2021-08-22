package com.chenxk.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/12 7:41
 */
//@Component
//@Aspect
//@Order(1)
public class SecurityAspect {
//    @Before(value = "com.chenxk.util.LogUtil.myPoint()")
    public static void start(JoinPoint joinPoint){

        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("Security："+name+"方法开始执行，参数是："+ Arrays.asList(args));
    }

//    @AfterReturning(value = "com.chenxk.util.LogUtil.myPoint()"
//            ,returning = "result")
    public static void stop(JoinPoint joinPoint,Object result){

        String name = joinPoint.getSignature().getName();
        System.out.println("Security："+name+"方法执行结束，结果是："+result);
    }

//    @AfterThrowing(value = "com.chenxk.util.LogUtil.myPoint()"
//            ,throwing = "exception")
    public static void logException(JoinPoint joinPoint, Exception exception){

        String name = joinPoint.getSignature().getName();
        System.out.println("Security："+name+"方法出现异常："+exception);
    }

//    @After("com.chenxk.util.LogUtil.myPoint()")
    public static void end(JoinPoint joinPoint){

        String name = joinPoint.getSignature().getName();
        System.out.println("Security："+name+"方法执行结束了......");
    }

    //@Around("com.chenxk.util.LogUtil.myPoint()")
    public Object myAround(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        Object proceed = null;

        try {
            System.out.println("Security："+"环绕前置通知："+name+"方法开始，参数是"+Arrays.asList(args));
            proceed = joinPoint.proceed(args);
            System.out.println("Security："+"环绕返回通知："+name+"方法返回，返回值是"+proceed);
        } catch (Throwable throwable) {
            System.out.println("Security："+"环绕异常通知："+name+"方法出现异常，异常信息是"+throwable);
        }finally {
            System.out.println("Security："+"环绕后置通知："+name+"方法结束");
        }
        return proceed;
    }

}
