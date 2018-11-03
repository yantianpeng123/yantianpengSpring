package com.yantianpeng.SpringTest;

import com.yantianpeng3.service.UserService;
import com.yantianpeng3.service.UserServiceTran;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**

* @Description:   测试Spring事物管理

* @Author:        yantianpeng

* @CreateDate:     2018/11/1 上午11:09


*/
public class Demo02 {


    public static void main(String[] args) {
        test01();
    }

    /**
     * 测试Spring事物
     */
    public  static void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
       // UserService userService = (UserService)classPathXmlApplicationContext.getBean("userService");
        //userService.add(12,"曹永芳","123456789Test");
        UserServiceTran userServiceTran=(UserServiceTran)classPathXmlApplicationContext.getBean("userServiceTran");
        userServiceTran.add("曹永芳","test23",33);

    }
}
