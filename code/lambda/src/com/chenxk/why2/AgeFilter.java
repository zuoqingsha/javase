package com.chenxk.why2;

import com.chenxk.why.Student;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 20:25
 */
public class AgeFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge()>14;
    }
}
