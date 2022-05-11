package com.itlizeSession.joole.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Sale
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 01:28
 * @Version 1.0
 **/
@Entity(name = "sale")
public class Sale {

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

    @Column(name = "manufacturer_id", length = 20)
    private Integer manufacturerId;


    @Column(name = "create_time", length = 20)
    private String createTime;

    @Column(name = "update_time", length = 20)
    private String updateTime;

    public Sale() {
    }

    public Sale(String name, String email, String phone,
                String webUrl, Integer manufacturerId,
                String createTime, String updateTime) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.webUrl = webUrl;
        this.manufacturerId = manufacturerId;
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

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
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
