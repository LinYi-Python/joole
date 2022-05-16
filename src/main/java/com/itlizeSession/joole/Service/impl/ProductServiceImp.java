package com.itlizeSession.joole.Service.impl;

import java.util.List;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yang shu
 * 2018-03-12 01:39
 */
@Service
public class ProductServiceImp implements ProductService {

     @Autowired
     private ProductRepository repository;

     @Override
     public List<Product> findAll() {
          return repository.findAll();
     }

     @Override
     public Product save(Product Product) {
          return repository.save(Product);

     }
}
