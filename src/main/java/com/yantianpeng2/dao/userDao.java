package com.yantianpeng2.dao;

import org.springframework.stereotype.Repository;

@Repository
public class userDao {
    public void add(){
        System.out.println("我是dao层的方法");
    }

}
