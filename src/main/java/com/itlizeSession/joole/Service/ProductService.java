package com.itlizeSession.joole.Service;


import com.itlizeSession.joole.Entity.*;

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

    public boolean create(Product product, Manufacturer manufacturer,
                          TechnicalDetail technicalDetail,
                          ProductType productType,
                          Sale sale);

    public boolean delete(Product product);

    public boolean update(Product product);

    public Product get(Integer id);

    public void deleteAll();

    public List<Product> findProducesByProductType(String name);

    public List<Product> findProductsByProductTypeAndTechnicalDetail(String name, TechnicalDetail technicalDetail);

    public List<Product> findProductsByProductTypeAndTechnicalDetailAndModelYearAndBrand(String name,
                                                                                         TechnicalDetail technicalDetail,
                                                                                         Integer modelYear,
                                                                                         String brand);
}
