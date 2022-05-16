package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName ProductServiceImp
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/13/22 11:34
 * @Version 1.0
 **/
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findOneById(Integer Id){
        return productRepository.findById(Id).orElse(null);
    }

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }


    @Override
    public Product save(Product product){
        return productRepository.save(product);
    }

}
