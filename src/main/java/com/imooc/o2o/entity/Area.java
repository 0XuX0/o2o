package com.imooc.o2o.entity;

import java.util.Date;

/**
 * (区域实体类)
 *
 * @author xuchh
 * @version 1.0.0
 * @date 2019/6/20
 */
public class Area {
    private Long area_id;
    private Integer priority;
    private String area_name;
    private Date createTime;
    private Date lastEditTime;

    @Override
    public String toString() {
        return "Area{" +
                "area_id=" + area_id +
                ", priority=" + priority +
                ", area_name='" + area_name + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
