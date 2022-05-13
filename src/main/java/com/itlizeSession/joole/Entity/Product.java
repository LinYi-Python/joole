package com.itlizeSession.joole.Entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 00:22
 * @Version 1.0
 **/
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "product_type_id", length = 20)
    private Integer productTypeId;

    @Column(name = "technical_detail_id", length = 20)
    private Integer technicalDetailId;

    @Column(name = "manufacturer_detail_id", length = 20)
    private Integer manufacturerDetailId;

    @Column(name = "model_year", length = 20)
    private Integer modelYear;

    @Column(name = "brand", length = 20)
    private String brand;

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private String createTime;

    @UpdateTimestamp
    @Column(name = "update_time", length = 20)
    private String updateTime;

    public Product() {
    }

    public Product(Integer productTypeId, Integer technicalDetailId,
                   Integer manufacturerDetailId, Integer modelYear, String brand,
                   String createTime, String updateTime) {
        this.productTypeId = productTypeId;
        this.technicalDetailId = technicalDetailId;
        this.manufacturerDetailId = manufacturerDetailId;
        this.modelYear = modelYear;
        this.brand = brand;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public Integer getTechnicalDetailId() {
        return technicalDetailId;
    }

    public void setTechnicalDetailId(Integer technicalDetailId) {
        this.technicalDetailId = technicalDetailId;
    }

    public Integer getManufacturerDetailId() {
        return manufacturerDetailId;
    }

    public void setManufacturerDetailId(Integer manufacturerDetailId) {
        this.manufacturerDetailId = manufacturerDetailId;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
