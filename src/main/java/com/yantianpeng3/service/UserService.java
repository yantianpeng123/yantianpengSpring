package com.yantianpeng3.service;

import com.yantianpeng3.TransactionUtils;
import com.yantianpeng3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TransactionUtils transactionUtils;
    public void add(Integer id,String name,String password){
        TransactionStatus begin=null;
     try{
        begin = transactionUtils.begin();
         int  i = userDao.add(id,name,password);
         int l= 1/0;
         System.out.println("insertResult:"+i+"事物提交成功");
     }catch (Exception ex){
        transactionUtils.rollback(begin);
     }
        transactionUtils.commit(begin);
    }




}
