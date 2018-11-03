package com.yantianpeng5.entity;

import lombok.Data;

@Data
public class Userentity {
    /**
     * 用户姓名
     */
    private String name;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户ID
     */
    private Integer id;
}
