package com.chenxk.dao;

import com.chenxk.entity.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: 陈显锟
 * @CreateDate: 2021/8/14 19:18
 */
@Repository
public class BuildingDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Building building){
        String sql = "INSERT INTO fc_building(estate_code,building_code,building_name) VALUES(?,?,?)";
        int update = jdbcTemplate.update(sql, building.getEstateCode(), building.getBuildingCode(), building.getBuildingName());
        System.out.println(update);
    }
}
