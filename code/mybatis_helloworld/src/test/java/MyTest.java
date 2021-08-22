import com.chenxk.bean.Emp;
import com.chenxk.bean.User;
import com.chenxk.dao.EmpDao;
import com.chenxk.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/21 20:25
 */
public class MyTest {

    SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void init(){
        //根据全局配置文件创建出SqlSessionFactory
        //SqlSessionFactory：负责创建SqlSession对象的工厂
        //SqlSession：表示跟数据库建立的一次会话
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test01(){
        //获取数据库的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Emp empByEmpno = null;
        try{
            //获取对应的映射接口对象
            EmpDao mapper = sqlSession.getMapper(EmpDao.class);
            //执行具体的sql语句
            empByEmpno = mapper.findEmpByEmpno(1);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭会话
            sqlSession.close();
        }
        System.out.println(empByEmpno);
    }

    @Test
    public void test02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        int zhangsan = mapper.insertEmp(new Emp(2,"zhangsan"));
        System.out.println(zhangsan);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test03(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        int lisi = mapper.updateEmp(new Emp(2,"lisi"));
        System.out.println(lisi);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test04(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        int lisi = mapper.deleteEmp(2);
        System.out.println(lisi);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test06(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUserName("lisi");
        int insert = mapper.insertUser(user);
        System.out.println(insert);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test07(){
        //获取数据库的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Emp> emps = new ArrayList<Emp>();
        try{
            //获取对应的映射接口对象
            EmpDao mapper = sqlSession.getMapper(EmpDao.class);
            //执行具体的sql语句
            emps = mapper.selectAllEmp();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭会话
            sqlSession.close();
        }
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
    @Test
    public void test08(){
        //获取数据库的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Emp emp = null;
        try{
            //获取对应的映射接口对象
            EmpDao mapper = sqlSession.getMapper(EmpDao.class);
            //执行具体的sql语句
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("empno",1);
            map.put("ename","SMITH");
            emp = mapper.selectEmpByNoAndName2(map);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭会话
            sqlSession.close();
        }
        System.out.println(emp);
    }

    @Test
    public void test09(){
        //获取数据库的会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Emp> emps = new ArrayList<Emp>();
        try{
            //获取对应的映射接口对象
            EmpDao mapper = sqlSession.getMapper(EmpDao.class);
            //执行具体的sql语句
            emps = mapper.selectEmpByNoAndName3(1,"SMITH","emp");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭会话
            sqlSession.close();
        }
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void test10(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Map<String, Object> map = mapper.selectEmpByNoReturnMap(1);
        System.out.println(map);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test11(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmpDao mapper = sqlSession.getMapper(EmpDao.class);
        Map<String, Emp> map = mapper.selectAllReturnMap();
        System.out.println(map);
        sqlSession.commit();
        sqlSession.close();
    }

}
