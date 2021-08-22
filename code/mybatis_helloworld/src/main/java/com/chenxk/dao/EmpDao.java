package com.chenxk.dao;

import com.chenxk.bean.Emp;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/21 20:12
 */
public interface EmpDao {

    public Emp findEmpByEmpno(Integer empno);

    public int updateEmp(Emp emp);

    public int deleteEmp(Integer empno);

    public int insertEmp(Emp emp);

    public Emp selectEmpByNoAndName(@Param("empno") Integer empno,@Param("ename") String ename);

    public Emp selectEmpByNoAndName2(Map<String,Object> map);

    public List<Emp> selectEmpByNoAndName3(@Param("empno") Integer empno,@Param("ename") String ename,
                                     @Param("t") String tablename);

    public List<Emp> selectAllEmp();

    public Map<String,Object> selectEmpByNoReturnMap(Integer empno);

    @MapKey("ename")
    public Map<String,Emp> selectAllReturnMap();
}
