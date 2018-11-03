package com.yantianpeng3.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Integer id,String name,String password){
        String sql ="insert into user1 (id,name,pwd)values(?,?,?);";
       return jdbcTemplate.update(sql,id,name,password);
    }
}
