package com.itlizeSession.joole.Entity;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

import java.util.*;

import static javax.persistence.CascadeType.ALL;


@Entity(name = "project")
public class Project {
    @Id
    @GeneratedValue
    private Integer ProjectId;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.DETACH)
    private User user;

    @JsonIgnore
    @OneToMany(targetEntity = ProjectProduct.class, cascade = CascadeType.REMOVE, mappedBy = "project")
    //hashset
    private List<ProjectProduct> projectProduct = new ArrayList<>();

    @CreatedDate
    @Column(name = "create_time", length = 20)
    private String createTime;

    @Column(name = "update_time", length = 20)
    private String updateTime;

    public Project() {
    }

    public Project(Integer projectId, User user, List<ProjectProduct> projectProduct, String createTime, String updateTime) {
        ProjectId = projectId;
        this.user = user;
        this.projectProduct = projectProduct;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getProjectId() {
        return ProjectId;
    }

    public User getUser() {
        return user;
    }

    public List<ProjectProduct> getProjectProduct() {
        return projectProduct;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProjectProduct(List<ProjectProduct> projectProduct) {
        this.projectProduct = projectProduct;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Project{" +
                "ProjectId=" + ProjectId +
                ", user=" + user +
                ", projectProduct=" + projectProduct +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
