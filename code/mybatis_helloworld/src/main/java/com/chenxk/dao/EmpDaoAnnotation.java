package com.chenxk.dao;

import com.chenxk.bean.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/21 20:12
 */
public interface EmpDaoAnnotation {
    @Select("select * from emp where empno = #{empno}")
    public Emp findEmpByEmpno(Integer empno);

    @Update("update emp set ename = #{ename} where empno = #{empno}")
    public int updateEmp(Emp emp);

    @Delete("delete from emp where empno = #{empno}")
    public int deleteEmp(Integer empno);

    @Insert("insert into emp(empno,ename) values(#{empno},#{ename})")
    public int insertEmp(Emp emp);
}
