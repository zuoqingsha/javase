package com.chenxk;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/22 9:29
 */
public class MyTypeHandler implements TypeHandler {
    public void setParameter(PreparedStatement preparedStatement, int i, Object o, JdbcType jdbcType) throws SQLException {

    }

    public Object getResult(ResultSet resultSet, String s) throws SQLException {
        return null;
    }

    public Object getResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    public Object getResult(CallableStatement callableStatement, int i) throws SQLException {
        return null;
    }
}
