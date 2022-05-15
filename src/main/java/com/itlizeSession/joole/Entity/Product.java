package com.itlizeSession.joole.Entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.itlizeSession.joole.Entity.Sales;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//testing github

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

    @Column(name = "name")
    private String name;

    @Column(name = "product_type_id")
    private Integer productTypeId;

    @Column(name = "technical_detail_id")
    private Integer technicalDetailId;

    @Column(name = "manufacturer_detail_id")
    private Integer manufacturerDetailId;

    @Column(name = "model_year")
    private Integer modelYear;

    @Column(name = "brand")
    private String brand;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_time")
    private String updateTime;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "Sales_ID_FK")
    private Sales sale;

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

    public Product() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Sales getSales() {
        return this.sale;
    }

    public void setSales(Sales sales) {
        this.sale = sales;
    }

}
