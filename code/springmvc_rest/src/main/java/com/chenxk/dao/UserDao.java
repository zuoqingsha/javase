package com.chenxk.dao;

import com.chenxk.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/15 11:27
 */
@Repository
public class UserDao {

    public void save(User user){
        System.out.println("save");
    }

    public void update(Integer id){
        System.out.println("update");
        System.out.println(id);
    }

    public void delete(Integer id){
        System.out.println("delete");
        System.out.println(id);
    }

    public void query(){
        System.out.println("query");
    }
}
