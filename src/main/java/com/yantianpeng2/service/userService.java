package com.yantianpeng2.service;

import com.yantianpeng2.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    private userDao userDao;

    public void add(){
        System.out.println("我是service层方法");
        userDao.add();
    }

    public void delete(){
        System.out.println("============>>>>>>>>>:测试环绕通知");
    }
}
