package com.imooc.o2o.entity;

import java.util.Date;

/**
 * (头条实体类)
 *
 * @author xuchh
 * @version 1.0.0
 * @date 2019/6/20
 */
public class HeadLine {
    private Long lineId;
    private String lineName;
    private String lineLink;
    private String lineImg;
    private Integer priority;
    //0.不可用 1.可用
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;

    @Override
    public String toString() {
        return "HeadLine{" +
                "lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", lineLink='" + lineLink + '\'' +
                ", lineImg='" + lineImg + '\'' +
                ", priority=" + priority +
                ", enableStatus=" + enableStatus +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }
}
