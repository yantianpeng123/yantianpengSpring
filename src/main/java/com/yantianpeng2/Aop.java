package com.yantianpeng2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
/**

* @Description:    注解的方式实现aop

* @Author:        yantianpeng

* @CreateDate:     2018/10/31 下午11:27


*/
public class Aop {
//前置通知 咋方法执行之前开始执行
    @Before("execution(* com.yantianpeng2.service.userService.add(..))")
    public void Before(){
        System.out.println("=====================>>>>>>>>>>>>>>:我是前置通知");
    }
//后置通知 在方法执行完毕之后开始执行
    @After("execution(* com.yantianpeng2.service.userService.add(..))")
    public void After(){
        System.out.println("====================>>>>>>>>>>>>>>:我是后置通知");
    }
//    环绕通知 在方法执行前后开始执行
    @Around("execution(* com.yantianpeng2.service.userService.delete(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("====================>>>>>>>>>>>>>>:我是环绕通知-----前");
      //方式 注释掉该方法 不会执行add方法
        proceedingJoinPoint.proceed();
        System.out.println("====================>>>>>>>>>>>>>>:我是环绕通知-----后");
    }
//在方法运行的时候执行
    @AfterReturning("execution(* com.yantianpeng2.service.userService.add(..))")
    public void afterRunning(){
        System.out.println("====================>>>>>>>>>>>>>>:运行通知");
    }
//在方法产生异常的时候开始执行
    @AfterThrowing("execution(* com.yantianpeng2.service.userService.add(..))")
    public void AftterThrows(){
        System.out.println("异常通知");
    }
}
