package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Repository.ProductTypeRepository;
import com.itlizeSession.joole.Service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName ProductTypeServiceImp
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/16/22 02:51
 * @Version 1.0
 **/
public class ProductTypeServiceImp implements ProductTypeService{
    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public ProductType findOneById(Integer Id){
        return productTypeRepository.findById(Id).orElse(null);
    }

    @Override
    public List<ProductType> findAll(){
        return productTypeRepository.findAll();
    }

    @Override
    public ProductType save(ProductType productType){
        return productTypeRepository.save(productType);
    }

    @Override
    public ProductType findByName(String name){
        return productTypeRepository.getProductTypeByProductTypeDetail(name);
    }

    @Override
    public boolean create(ProductType productType){
        if(productType == null) {
            System.out.println("null input");
            return false;
        }

        ProductType target = findOneById(productType.getId());
        if(target != null) {
            System.out.println("ProductType already exists");
            return false;
        }

//        try{
//
//        }catch (){
//
//        }

            return true;
    }

    @Override
    public void delete(ProductType productType) {

    }

    @Override
    public ProductType get(Integer id) {
        return null;
    }

    @Override
    public void update(ProductType productType) {

    }

}
