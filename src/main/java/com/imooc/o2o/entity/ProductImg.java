package com.imooc.o2o.entity;

import java.util.Date;

/**
 * (商品详情图片实体类)
 *
 * @author xuchh
 * @version 1.0.0
 * @date 2019/6/20
 */
public class ProductImg {
    private Long productImdId;
    private String imgAddr;
    private String imgDesc;
    private Integer priority;
    private Date createTime;
    private Long productId;

    @Override
    public String toString() {
        return "productImg{" +
                "productImdId=" + productImdId +
                ", imgAddr='" + imgAddr + '\'' +
                ", imgDesc='" + imgDesc + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", productId=" + productId +
                '}';
    }
}
