package com.yantianpeng.entity;

import lombok.Data;

/**
 * Int和Integer的区别
 * Int是基本数据类型 默认是是0
 * Integer 是int的包装类 默认值可以是null
 */
@Data//为该类提供了get/set读写属性，还提供了equals(),hashCode() toString()方法
public class UserEntity {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 年龄
     */
    private Integer age;

    public UserEntity (){
        System.out.println("无参数构造函数");
    }

    public UserEntity(String userName,Integer age){
        this.userName=userName;
        this.age =age;
    }
}
