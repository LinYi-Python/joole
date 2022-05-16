package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Entity.Manufacturer;
import com.itlizeSession.joole.Entity.Sale;

import java.util.Date;

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

    @ManyToOne(targetEntity = ProductType.class, cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_type_id")
    private ProductType productType;


//    @ManyToone(tragetE = Story)
//    @Joins name = story_id
//    private Story story


//    @Column(name = "product_type_id", length = 20)
//    private Integer productTypeId;

    @ManyToOne(targetEntity = TechnicalDetail.class, cascade = CascadeType.DETACH)
    @JoinColumn(name = "technical_detail_id")
    private TechnicalDetail technicalDetail;


//    @Column(name = "technical_detail_id", length = 20)
//    private Integer technicalDetailId;

    @ManyToOne(targetEntity = Manufacturer.class, cascade = CascadeType.DETACH)
    @JoinColumn(name = "manufacturer_detail_id")
    private Manufacturer manufacturerDetailId;

//    @Column(name = "manufacturer_detail_id", length = 20)
//    private Integer manufacturerDetailId;

    @Column(name = "model_year", length = 20)
    private Integer modelYear;


    @OneToOne(targetEntity = Sale.class, cascade = CascadeType.DETACH)
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @Column(name = "brand", length = 20)
    private String brand;

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private Date createTime;


    @Column(name = "update_time", length = 20)
    private Date updateTime;

    public Product() {
    }

    public Product(Integer id, String name, ProductType productType, TechnicalDetail technicalDetail, Manufacturer manufacturerDetailId, Integer modelYear, String brand, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.technicalDetail = technicalDetail;
        this.manufacturerDetailId = manufacturerDetailId;
        this.modelYear = modelYear;
        this.brand = brand;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public TechnicalDetail getTechnicalDetail() {
        return technicalDetail;
    }

    public void setTechnicalDetail(TechnicalDetail technicalDetail) {
        this.technicalDetail = technicalDetail;
    }

    public Manufacturer getManufacturerDetailId() {
        return manufacturerDetailId;
    }

    public void setManufacturerDetailId(Manufacturer manufacturerDetailId) {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
