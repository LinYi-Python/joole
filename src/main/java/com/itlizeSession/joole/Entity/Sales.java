package com.itlizeSession.joole.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

/**
 * @ClassName Sale
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 01:28
 * @Version 1.0
 **/
@Entity(name = "sale")
public class Sales {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "web_url", length = 20)
    private String webUrl;

    @Column(name = "product_id", length = 20)
    private Integer productId;

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private Timestamp createTime;

    @Column(name = "update_time", length = 20)
    private Timestamp updateTime;

    public Sales() {
    }

    public Sales(String name, String email, String phone,
            String webUrl, Integer productId,
            Timestamp createTime, Timestamp updateTime) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.webUrl = webUrl;
        this.productId = productId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    // public List<Product> getProduct() {
    // return this.product;
    // }

    // public void setProduct(List<Product> product) {
    // this.product = product;
    // }
}
