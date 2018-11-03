package com.yantianpeng2;

import org.aspectj.lang.ProceedingJoinPoint;
/**

* @Description:   xml的方式实现注解类

* @Author:        yantianpeng

* @CreateDate:     2018/10/31 下午11:28


*/
public class Aop02 {
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
        System.out.println("====================>>>>>>>>>>>>>>:我是环绕通知-----前");
        proceedingJoinPoint.proceed();
        System.out.println("====================>>>>>>>>>>>>>>:我是环绕通知-----后");

    }
    //在方法运行的时候执行
    public void afterRunning(){
        System.out.println("====================>>>>>>>>>>>>>>:运行通知");
    }
    //在方法产生异常的时候开始执行
    public void AftterThrows(){
        System.out.println("异常通知");
    }
}
