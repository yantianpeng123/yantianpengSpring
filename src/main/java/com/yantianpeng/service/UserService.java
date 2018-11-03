package com.yantianpeng.service;

import com.yantianpeng.dao.UserDao;
import lombok.Data;

/**

* @Description:   Service层代码

* @Author:        yantianpeng

* @CreateDate:     2018/10/30 下午10:59


*/
public class UserService {

    private UserDao userDao;

    public void add(){
        System.out.println("我是service层add...");
        userDao.add();
    }

    /**
     * 加上get和set方法 Spring执行是会先执行set方法
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao(){
        return userDao;
    }
}
