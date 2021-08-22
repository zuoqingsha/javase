package com.chenxk.why2;

import com.chenxk.why.Student;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 20:24
 */
public interface StudentFilter {
    boolean compare(Student student);
}
