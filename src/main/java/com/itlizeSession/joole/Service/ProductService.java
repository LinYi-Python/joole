package com.itlizeSession.joole.Service;


import com.itlizeSession.joole.Entity.Product;

import java.util.List;

/**
 * @ClassName ProductServiceImp
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/16/22 02:21
 * @Version 1.0
 **/
public interface ProductService {
    public Product findOneById(Integer Id);

    public List<Product> findAll();

    public Product save(Product product);

}
