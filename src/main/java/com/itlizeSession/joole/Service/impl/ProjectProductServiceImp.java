package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Repository.ProjectProductRepository;
import com.itlizeSession.joole.Repository.ProjectRepository;
import com.itlizeSession.joole.Service.ProjectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ProjectProductServiceImp implements ProjectProductService {

    @Autowired
    ProjectProductRepository projectProductRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Collection<ProjectProduct> findALl() {
        return projectProductRepository.findAll();
    }

    @Override
    public ProjectProduct findById(Integer Id) {
        return projectProductRepository.findById(Id).orElse(null);
    }

    @Override
    public boolean create(ProjectProduct projectProduct) {
        Optional<ProjectProduct> target = projectProductRepository.findById(projectProduct.getProjectProductId());
        if (target.isPresent()) {
            return false;
        }

        try {
            projectProductRepository.save(projectProduct);
        } catch (Exception e){
            System.out.println("something wrong happens when creating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(ProjectProduct projectProduct) {
        if (projectProduct == null) {
            System.out.println("input is null");
            return false;
        }
        System.out.println("try to delete product" + projectProduct.getProjectProductId());

        try {
            projectProductRepository.delete(projectProduct);
        } catch (Exception e) {
            System.out.println("something wrong happens when deleting" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(ProjectProduct projectProduct) {
        if (projectProduct == null) {
            return false;
        }
        try {
            projectProductRepository.save(projectProduct);
        } catch (Exception e) {
            System.out.println("something wrong happens when updating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public ProjectProduct get(Integer id) {
        if (id == null) {
            return null;
        }
        Optional<ProjectProduct> result = projectProductRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }else{
            return null;
        }
    }
}
