package com.yantianpeng.SpringTest;

import com.yantianpeng.entity.UserEntity;
import com.yantianpeng.service.UserService;
import com.yantianpeng2.service.userService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**

* @Description:  Spring测试类

* @Author:        yantianpeng

* @CreateDate:     2018/10/30 下午9:25


*/
public class Demo001 {
    public static void main(String[] args) {
       // test02();
        //test03();
        test04();
    }
    public static void test04(){
        try{
            ClassPathXmlApplicationContext classPathXmlApplicationContext =
                    new ClassPathXmlApplicationContext("applicationContxt2.xml");
            userService userService = (userService)classPathXmlApplicationContext.getBean("userService");
             userService.add();
            //userService.delete();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    /**
     * 测试依赖注入
     */
    public static void test03(){
        try{
            ClassPathXmlApplicationContext classPathXmlApplicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
            UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");
            userService.add();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * 通过有参数的构造函数进行参数的传值
     */
    public static void test02(){
       try {
           ClassPathXmlApplicationContext classPathXmlApplicationContext =
                   new ClassPathXmlApplicationContext("applicationContext.xml");
           UserEntity userentity01 = ( UserEntity)classPathXmlApplicationContext.getBean("userentity02");
           System.out.println(userentity01.getAge());
           System.out.println(userentity01.getUserName());
       }catch (Exception ex){
           ex.printStackTrace();
       }
    }

    /**
     * 测试无参数构造函数的
     */
    public static void test01(){
        try {
            ClassPathXmlApplicationContext classPathXmlApplicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
            //不是有自己创建的而是有容器创建的 不是通过new实现的 是通过反射实现的
            UserEntity userentity01 = (UserEntity)classPathXmlApplicationContext.getBean("userentity01");
            UserEntity userentity02 = (UserEntity)classPathXmlApplicationContext.getBean("userentity01");
            userentity01.setAge(20);
            userentity01.setUserName("张三");
            //构造函数只执行一次，证明Spring是单例模式的
            //使用单例模式需要注意线程安全问题。
            System.out.println("证明是单例模式："+(userentity01==userentity02));
            System.out.println(userentity01.toString());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
