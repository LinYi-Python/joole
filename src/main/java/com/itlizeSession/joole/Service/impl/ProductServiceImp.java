package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.*;
import com.itlizeSession.joole.Repository.*;
import com.itlizeSession.joole.Service.ProductService;
import com.itlizeSession.joole.Service.impl.ProductTypeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;

    @Autowired
    private SaleRepository saleRepository;


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

    @Override
    public boolean create(Product product, Manufacturer manufacturer,
                          TechnicalDetail technicalDetail,
                          ProductType productType,
                          Sale sale){
        if(product == null || manufacturer== null
                || technicalDetail == null
                || productType == null|| sale == null) {
            System.out.println("null input");
            return false;
        }
        Product target = findOneById(product.getId());
        if(target != null) {
            System.out.println("Product already exists");
            return false;
        }

        try{
            productRepository.save(product);

            manufacturer.addProducts(product);
            productRepository.save(product);
            manufacturerRepository.save(manufacturer);

            technicalDetail.addProducts(product);
            productRepository.save(product);
            technicalDetailRepository.save(technicalDetail);

            productType.addProducts(product);
            productRepository.save(product);
            productTypeRepository.save(productType);

            sale.addProducts(product);
            productRepository.save(product);
            productRepository.save(product);


        }catch (Exception e){
            System.out.println("something wrong happens when creating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public boolean update(Product product){
        if(product == null) {
            System.out.println("input is null, nothing to change");
            return false;
        }
        System.out.println("try to update product" + product.getId());

        try{
            productRepository.save(product);
        }catch (Exception e) {
            System.out.println("something wrong happens when updating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public boolean delete(Product product){
        if(product == null) {
            System.out.println("input is null");
            return false;
        }
        System.out.println("try to delete product" + product.getId());

        try{
            productRepository.delete(product);
        }catch (Exception e){
            System.out.println("something wrong happens when creating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }


    @Override
    public Product get(Integer id){
        if(id == null) {
            return null;
        }
        Optional<Product> result = productRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }else{
            return null;
        }
    }


    @Override
    public boolean deleteAll(){
        try{
            productRepository.deleteAll();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<Product> findProducesByProductType(String name){
        //name is the product Type name
        ProductType productType = productTypeRepository.getProductTypeByProductTypeDetail(name);
        return productRepository.findProductsByProductType(productType);
    }


    @Override
    public List<Product> findProductsByProductTypeAndTechnicalDetail(String name, TechnicalDetail technicalDetail){
        //name is the product Type name
        ProductType productType = productTypeRepository.getProductTypeByProductTypeDetail(name);
        return productRepository.findProductsByProductTypeAndTechnicalDetail(productType, technicalDetail);
    }

    @Override
    public List<Product> findProductsByProductTypeAndTechnicalDetailAndModelYearAndBrand(String name,
                                                                                         TechnicalDetail technicalDetail,
                                                                                         Integer modelYear,
                                                                                         String brand){
        //name is the product Type name
        ProductType productType = productTypeRepository.getProductTypeByProductTypeDetail(name);
        return productRepository.findProductsByProductTypeAndTechnicalDetailAndModelYearAndBrand(productType,
                technicalDetail, modelYear, brand);
    }

}
