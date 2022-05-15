package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;

import java.util.List;

public interface ProductService {


     List<Product> findAll();

     public Product save(Product Product);
}
