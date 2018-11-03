package com.yantianpeng5.service;

import com.yantianpeng5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private LogService logService;
    @Transactional
    public boolean addUser(Integer id,String name,String pwd){
      logService.addLog(id);
        int i = userDao.addUser(id, name, pwd);
       int j = 1/0;
        return i>0;
    }
}
