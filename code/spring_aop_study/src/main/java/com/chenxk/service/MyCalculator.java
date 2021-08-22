package com.chenxk.service;

import com.chenxk.util.LogUtil;
import org.springframework.stereotype.Service;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 17:09
 */
@Service
public class MyCalculator implements Calculator {

    public int add(int i, int j) {
       // LogUtil.start(i,j);
        int result = i + j;
//        LogUtil.stop(result);
        return result;
    }

    public int sub(int i, int j) {
//        LogUtil.start(i,j);
        int result = i - j;
//        LogUtil.stop(result);
        return result;
    }

    public int mult(int i, int j) {
//        LogUtil.start(i,j);
        int result = i * j;
//        LogUtil.stop(result);
        return result;
    }

    public int div(int i, int j) {
//        LogUtil.start(i,j);
        int result = i / j;
//        LogUtil.stop(result);
        return result;
    }
}
