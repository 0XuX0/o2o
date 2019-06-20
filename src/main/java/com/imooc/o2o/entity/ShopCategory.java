package com.imooc.o2o.entity;

import java.util.Date;

/**
 * (店铺类别实体类)
 *
 * @author xuchh
 * @version 1.0.0
 * @date 2019/6/20
 */
public class ShopCategory {
    private Long shopCategory;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

    @Override
    public String toString() {
        return "shopCategory{" +
                "shopCategory=" + shopCategory +
                ", shopCategoryName='" + shopCategoryName + '\'' +
                ", shopCategoryDesc='" + shopCategoryDesc + '\'' +
                ", shopCategoryImg='" + shopCategoryImg + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", parent=" + parent +
                '}';
    }
}
