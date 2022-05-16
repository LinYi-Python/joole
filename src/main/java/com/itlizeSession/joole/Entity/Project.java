package com.itlizeSession.joole.Entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Project
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 00:15
 * @Version 1.0
 **/
@Entity(name = "project")
public class Project {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user_id", length = 20)
    private Integer user_id;

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private String createTime;

    @Column(name = "update_time", length = 20)
    private String updateTime;

    public Project() {
    }

    public Project(Integer user_id, String createTime, String updateTime) {
        this.user_id = user_id;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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
