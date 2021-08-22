package com.chenxk.dao;

import com.chenxk.bean.Student;
import com.chenxk.bean.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/8 16:25
 */
@Repository
public class TeacherDao extends BaseDao<Teacher> {
    public void save() {
        System.out.println("保存老师");
    }
}
