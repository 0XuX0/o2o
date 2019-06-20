package com.imooc.o2o.entity;

import java.util.Date;
import java.util.List;

/**
 * (商品实体类)
 *
 * @author xuchh
 * @version 1.0.0
 * @date 2019/6/20
 */
public class Product {
    private Long productId;
    private String productName;
    private String productDesc;
    //缩略图
    private String imgAddr;
    private String normalPrice;
    private String promotionPrice;
    private Integer priority;
    private Date createTIme;
    private Date lastEditTime;
    //-1.不可用 0.下架 1.在前端展示系统展示
    private Integer enableStatus;

    private List<ProductImg> productImgList;
    private ProductCategory productCategory;
    private Shop shop;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", imgAddr='" + imgAddr + '\'' +
                ", normalPrice='" + normalPrice + '\'' +
                ", promotionPrice='" + promotionPrice + '\'' +
                ", priority=" + priority +
                ", createTIme=" + createTIme +
                ", lastEditTime=" + lastEditTime +
                ", enableStatus=" + enableStatus +
                ", productImgList=" + productImgList +
                ", productCategory=" + productCategory +
                ", shop=" + shop +
                '}';
    }
}
