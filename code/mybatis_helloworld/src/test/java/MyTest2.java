import com.chenxk.bean.Dog;
import com.chenxk.dao.DogDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/22 16:22
 */
public class MyTest2 {
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
        SqlSession sqlSession = sqlSessionFactory.openSession();
        DogDao mapper = sqlSession.getMapper(DogDao.class);
        Dog dog = mapper.selectDogById(2);
        System.out.println(dog);
        sqlSession.close();
    }
}
