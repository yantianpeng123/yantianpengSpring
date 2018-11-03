package com.yantianpeng5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**

* @Description:    日志类

* @Author:        yantianpeng

* @CreateDate:     2018/11/1 下午10:04


*/
@Repository
public class Logdao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addLog(Integer id){
      String   InsertLogSql ="insert into log (id,dateLog) values(?,?)";
      String datelog = Long.toString(System.currentTimeMillis());
        return jdbcTemplate.update(InsertLogSql,id,datelog);
    }
}
