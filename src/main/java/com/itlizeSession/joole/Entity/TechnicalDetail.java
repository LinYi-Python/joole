package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import com.itlizeSession.joole.Entity.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProductDetail
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 01:08
 * @Version 1.0
 **/
@Entity(name = "technical_detail")
public class TechnicalDetail {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "product_type_id", length = 20)
    private Integer productTypeId;

    @Column(name = "technical_detail_name", length = 20)
    private String technicalDetailName;

    @Column(name = "technical_detail_number", length = 20)
    private Integer technicalDetailNumber;

//    @Column(name = "techninal_detail_comment", length = 20)
//    private String techninalDetailComment;

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private String createTime;


    @Column(name = "update_time", length = 20)
    private String updateTime;

    @JsonIgnore
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.REMOVE, mappedBy = "technicalDetail")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Product> products = new ArrayList<>();

    public TechnicalDetail() {
    }

    public TechnicalDetail(String technicalDetailName, Integer technicalDetailNumber,
                            Integer productTypeId,
                           String createTime, String updateTime) {
        this.technicalDetailName = technicalDetailName;
        this.technicalDetailNumber = technicalDetailNumber;

        this.productTypeId = productTypeId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getTechnicalDetailName() {
        return technicalDetailName;
    }

    public void setTechnicalDetailName(String technicalDetailName) {
        this.technicalDetailName = technicalDetailName;
    }

    public Integer getTechnicalDetailNumber() {
        return technicalDetailNumber;
    }

    public void setTechnicalDetailNumber(Integer technicalDetailNumber) {
        this.technicalDetailNumber = technicalDetailNumber;
    }


    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
