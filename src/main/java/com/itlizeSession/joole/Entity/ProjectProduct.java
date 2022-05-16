package com.itlizeSession.joole.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity(name = "project_product")
public class ProjectProduct {
    @Id
    @GeneratedValue
    private Integer ProjectProductId;

    @ManyToOne(targetEntity = Project.class, cascade = CascadeType.DETACH)
    private Project project;

    @JsonIgnore
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.DETACH, mappedBy = "projectProductId")
    private List<Product> MYproduct = new ArrayList<>();

    public ProjectProduct() {
    }

    public ProjectProduct(Integer projectProductId, Project project, List<Product> MYproduct) {
        ProjectProductId = projectProductId;
        this.project = project;
        this.MYproduct = MYproduct;
    }

    public Integer getProjectProductId() {
        return ProjectProductId;
    }

    public Project getProject() {
        return project;
    }

    public List<Product> getProduct() {
        return MYproduct;
    }

    @Override
    public String toString() {
        return "ProjectProduct{" +
                "ProjectProductId=" + ProjectProductId +
                ", project=" + project +
                ", product=" + MYproduct +
                '}';
    }


}
