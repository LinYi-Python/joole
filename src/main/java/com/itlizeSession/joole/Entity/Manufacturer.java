package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.*;

/**
 * @ClassName Manufacturer
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 01:23
 * @Version 1.0
 **/
@Entity(name = "manufacturer")
public class Manufacturer {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_name", length = 20)
    private String userName;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "department", length = 20)
    private String department;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "web_url", length = 20)
    private String webUrl;


    @Column(name = "create_time", length = 20)
    private Date createTime;


    @Column(name = "update_time", length = 20)
    private Date updateTime;

    @JsonIgnore
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.REMOVE, mappedBy = "manufacturerDetailId")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Collection<Product> products = new HashSet<>();


    public Manufacturer() {
    }

    public Manufacturer(String userName, String password,
                        String department, String phone,
                        String email, String webUrl,
                        Date createTime, Date updateTime) {
        this.userName = userName;
        this.password = password;
        this.department = department;
        this.phone = phone;
        this.email = email;
        this.webUrl = webUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
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
