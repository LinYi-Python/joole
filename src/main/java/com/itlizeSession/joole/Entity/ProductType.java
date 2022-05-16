package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.data.annotation.CreatedDate;
import com.itlizeSession.joole.Entity.Product;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @JsonIgnore
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.REMOVE, mappedBy = "productType")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Product> products = new ArrayList<>();


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
