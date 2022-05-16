package com.itlizeSession.joole.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @ClassName ProjectProduct
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 00:47
 * @Version 1.0
 **/
@Entity(name = "project_product")
public class ProjectProduct {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "project_id", length = 20)
    private Integer projectId;

    @Column(name = "product_id", length = 20)
    private Integer productId;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "Product_FK")
    private Project project;

    public ProjectProduct() {
    }

    public ProjectProduct(Integer projectId, Integer productId) {
        this.projectId = projectId;
        this.productId = productId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Project getProject() {
        return this.project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
