package com.yantianpeng.SpringTest;

import com.yantianpeng4.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo03 {


    public static void main(String[] args) {
        test01();
    }

    public static void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext4.xml");
        UserService userService=(UserService)classPathXmlApplicationContext.getBean("userService");
        boolean b = userService.addUser(34, "曹永芳", "test123456789");
        System.out.println("插入是否成功："+b);
    }
}
