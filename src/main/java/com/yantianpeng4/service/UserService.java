package com.yantianpeng4.service;

import com.yantianpeng4.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public boolean addUser(Integer id,String username,String pwd){
         return userDao.addUser(id,username,pwd)>0;
    }
}
