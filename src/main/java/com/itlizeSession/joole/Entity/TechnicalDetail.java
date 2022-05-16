package com.itlizeSession.joole.Entity;

import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

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

    // @Column(name = "product_type_id", length = 20)
    // private Integer productTypeId;

    @Column(name = "technical_detail_name", length = 20)
    private String technicalDetailName;

    @Column(name = "technical_detail_number", length = 20)
    private Integer technicalDetailNumber;

    // @Column(name = "techninal_detail_comment", length = 20)
    // private String techninalDetailComment;


    @Column(name = "create_time", length = 20)
    private Timestamp createTime;

    @Column(name = "update_time", length = 20)
    private Timestamp updateTime;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductType_FK")
    private ProductType productType;

    public TechnicalDetail() {
    }

    public TechnicalDetail(String technicalDetailName, Integer technicalDetailNumber,
            Integer productTypeId,
            Timestamp createTime, Timestamp updateTime) {
        this.technicalDetailName = technicalDetailName;
        this.technicalDetailNumber = technicalDetailNumber;
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

    public ProductType getProductType() {
        return this.productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
