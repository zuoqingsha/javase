package com.chenxk.service;

import org.springframework.stereotype.Service;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 17:06
 */

public interface Calculator {
    public int add(int i, int j);
    public int sub(int i, int j);
    public int mult(int i, int j);
    public int div(int i, int j);
}
