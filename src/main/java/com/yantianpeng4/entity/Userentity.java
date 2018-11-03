package com.yantianpeng4.entity;

import lombok.Data;

@Data
public class Userentity {
    /**
     * 用户名字
     */
    private String name;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户id
     */
    private Integer id;
}
