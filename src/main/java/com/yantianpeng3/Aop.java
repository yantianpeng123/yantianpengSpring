package com.yantianpeng3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DelegatingDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class Aop {

    @Autowired
    private TransactionUtils transactionUtils;
    private TransactionStatus begin;
    //前置通知 咋方法执行之前开始执行
    public void Before(){
        System.out.println("=====================>>>>>>>>>>>>>>:我是前置通知");
    }
    //后置通知 在方法执行完毕之后开始执行
    public void After(){
        System.out.println("====================>>>>>>>>>>>>>>:我是后置通知");
    }
    //    环绕通知 在方法执行前后开始执行
    public void Around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        //开启事物
        begin = transactionUtils.begin();
        System.out.println("====================>>>>>>>>>>>>>>:我是环绕通知-----前");
      try{
          proceedingJoinPoint.proceed();
          System.out.println("=====================>>>>>>>>>发生异常没");
      }catch (Exception ex){
          transactionUtils.rollback(begin);
      }
        System.out.println("====================>>>>>>>>>>>>>>:我是环绕通知-----后");
        //提交事物
        transactionUtils.commit(begin);

    }
    //在方法运行的时候执行
    public void afterRunning(){
        System.out.println("====================>>>>>>>>>>>>>>:运行通知");
    }
    //在方法产生异常的时候开始执行
    public void AftterThrows(){
        System.out.println("异常通知");
        //异常发生开始回滚事物
        transactionUtils.rollback(begin);
    }
}
