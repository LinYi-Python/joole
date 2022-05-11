package com.itlizeSession.joole.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Product_type
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 00:36
 * @Version 1.0
 **/
@Entity(name = "product_type")
public class ProductType {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "product_type_detail", length = 50)
    private String productTypeDetail;

    @Column(name = "create_time", length = 50)
    private String createTime;

    public ProductType() {
    }

    public ProductType(String productTypeDetail, String createTime) {
        this.productTypeDetail = productTypeDetail;
        this.createTime = createTime;
    }

    public String getProductTypeDetail() {
        return productTypeDetail;
    }

    public void setProductTypeDetail(String productTypeDetail) {
        this.productTypeDetail = productTypeDetail;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
