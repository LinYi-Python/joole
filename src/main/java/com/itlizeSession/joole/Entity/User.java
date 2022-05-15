package com.itlizeSession.joole.Entity;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName User
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/10/22 22:45
 * @Version 1.0
 **/
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_name", length = 20)
    private String userName;

    @Column(name = "password", length = 20)
    private String password;

    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "profile_picture_url", length = 20)
    private String profilePictureUrl;

    // private boolean isAdmin; // 0 is admin, 1 is user

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private String createTime;

    @Column(name = "update_time", length = 20)
    private String updateTime;

    public User(String userName, String password, String name, String profilePictureUrl, String createTime,
            String updateTime) {
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.profilePictureUrl = profilePictureUrl;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
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
