package com.yantianpeng3.service;

import com.yantianpeng3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceTran {
    @Autowired
    private UserDao userDao;


    public void add(String name,String pwd,Integer id){
        int add = userDao.add(id,name, pwd);
        System.out.println("插入的结果是："+add+"：行");
       // int  i =1/0;
    }

    /**
     * 使用声明式事物是 在service不实用try{}catch(Exception ex){}
     * 结构进行捕获 可以在控制层捕获
     * @param name
     * @param pwd
     * @param id
     */
    public void add02(String name,String pwd,Integer id){
        System.out.println("======================>>>>>>>>:我是service，开始执行dao层");
        try{
            int add = userDao.add(id, name, pwd);
            int i =1/0;
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
