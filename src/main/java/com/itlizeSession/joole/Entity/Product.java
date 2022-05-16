package com.itlizeSession.joole.Entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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

    // @Column(name = "product_type_id")
    // private Integer productTypeId;

    // @Column(name = "technical_detail_id")
    // private Integer technicalDetailId;

    // @Column(name = "manufacturer_detail_id")
    // private Integer manufacturerDetailId;

    @Column(name = "model_year")
    private Integer modelYear;

    @Column(name = "brand")
    private String brand;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "update_time")
    private Timestamp updateTime;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "Sales_ID_FK")
    private Sales sale;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "Manufacturer_ID_FK")
    private Manufacturer manufacturer;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "Product_Type_ID_FK")
    private ProductType productType;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "Technical_Details_ID_FK")
    private TechnicalDetail technicalDetail;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "Project_Product_FK")
    private ProjectProduct projectProduct;

    public Product(Integer productTypeId, Integer technicalDetailId,
            Integer manufacturerDetailId, Integer modelYear, String brand,
            Timestamp createTime, Timestamp updateTime) {

        // this.productTypeId = productTypeId;
        // this.technicalDetailId = technicalDetailId;
        // this.manufacturerDetailId = manufacturerDetailId;
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Sales getSales() {
        return this.sale;
    }

    public void setSales(Sales sales) {
        this.sale = sales;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public TechnicalDetail getTechnicalDetail() {
        return this.technicalDetail;
    }

    public void setTechnicalDetail(TechnicalDetail technicalDetail) {
        this.technicalDetail = technicalDetail;
    }

    public ProjectProduct getProjectProduct() {
        return this.projectProduct;
    }

    public void setProjectProduct(ProjectProduct projectProduct) {
        this.projectProduct = projectProduct;
    }

}
