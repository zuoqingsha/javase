package com.chenxk.why2;

import com.chenxk.why.Student;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/3 20:26
 */
public class ScoreFilter implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getScore()>75;
    }
}
