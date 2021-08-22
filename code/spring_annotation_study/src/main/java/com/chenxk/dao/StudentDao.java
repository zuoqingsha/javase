package com.chenxk.dao;

import com.chenxk.bean.Student;
import org.springframework.stereotype.Repository;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 16:25
 */
@Repository
public class StudentDao extends BaseDao<Student> {
    public void save() {
        System.out.println("保存学生");
    }
}
