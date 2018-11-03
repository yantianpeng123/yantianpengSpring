package com.yantianpeng5.dao;

import com.sun.corba.se.spi.ior.IdentifiableBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addUser(Integer id,String name,String pwd){
       String insertSql ="insert into user1 (id,name,pwd) values(?,?,?)";
      return jdbcTemplate.update(insertSql,id,name,pwd);
    }
}
