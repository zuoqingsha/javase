import com.alibaba.druid.pool.DruidDataSource;
import com.chenxk.dao.BuildingDao;
import com.chenxk.entity.Building;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/14 16:55
 */
public class MyTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01() throws SQLException {
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.getConnection());
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }

    @Test
    public void test02(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "INSERT INTO fc_building(estate_code,building_code,building_name) " +
                     "VALUES(?,?,?)";
        int update = jdbcTemplate.update(sql, "22", "B6", "第4号楼");
        System.out.println(update);
    }

    @Test
    public void test03(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "INSERT INTO fc_building(estate_code,building_code,building_name) " +
                "VALUES(?,?,?)";
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{"22", "B7", "第5号楼"});
        list.add(new Object[]{"22", "B8", "第6号楼"});
        int[] update = jdbcTemplate.batchUpdate(sql, list);
        for (int i : update) {
            System.out.println(i);
        }
    }

    @Test
    public void test04(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "delete from fc_building where id=?";
        int update = jdbcTemplate.update(sql,6);
        System.out.println(update);
    }

    @Test
    public void test05(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update fc_building set building_name=? where id=?";
        int update = jdbcTemplate.update(sql,"five",7);
        System.out.println(update);
    }

    @Test
    public void test06(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select id,estate_code,building_code,building_name from fc_building where id=?";
        Building query = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Building>(Building.class),5);
        System.out.println(query);
    }

    @Test
    public void test07(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "select id,estate_code,building_code,building_name from fc_building where id>?";
        List<Building> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Building>(Building.class),5);
        for (Building building : query) {
            System.out.println(building);
        }
    }

    @Test
    public void test08(){
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        BuildingDao buildingDao = context.getBean("buildingDao", BuildingDao.class);
        buildingDao.save(new Building("22","B9","seven"));
    }
}
