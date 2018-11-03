package com.yantianpeng.SpringTest;

import com.yantianpeng5.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo05 {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext5.xml");
        UserService userService= (UserService)classPathXmlApplicationContext.getBean("userService");
        boolean bool = userService.addUser(39, "曹永芳", "wertyui");
        System.out.println("是否插入成功："+bool);
    }
}
