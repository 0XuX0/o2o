package com.imooc.o2o.entity;

import java.util.Date;

/**
 * (用户信息实体类)
 *
 * @author xuchh
 * @version 1.0.0
 * @date 2019/6/20
 */
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private Integer gender;
    private Integer enablestatus;
    // 1.顾客 2.店家 3.超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;

    @Override
    public String toString() {
        return "PersonInfo{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", profileImg='" + profileImg + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", enablestatus=" + enablestatus +
                ", userType=" + userType +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
