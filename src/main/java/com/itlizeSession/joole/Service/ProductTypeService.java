package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;

import java.util.List;

/**
 * @ClassName ProductTypeService
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/16/22 02:51
 * @Version 1.0
 **/
public interface ProductTypeService {

    public ProductType findOneById(Integer Id);

    public List<ProductType> findAll();

    public ProductType save(ProductType productType);
}
