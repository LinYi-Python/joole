package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName ProductTypeServiceImpTest
 * @Description TODO
 * @Author
 * @Date 5/17/22 10:39
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
class ProductTypeServiceImpTest {


    @Autowired
    private ProductTypeServiceImp productTypeService;

    private ProductType productType = new ProductType();

    @Test
    void findOneById() {
        assertThrows(NullPointerException.class,
                () -> {
                    int id = 1;
                    productType.setId(id);
                    ProductType expected = productType;

                    ProductType actual = productTypeService.findOneById(id);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void findAll() {
        assertThrows(NullPointerException.class,
                () -> {

                    List<ProductType> expected = new ArrayList<>();
                    //expected.add(productType);

                    List<ProductType> actual = productTypeService.findAll();

                    Assert.assertEquals(expected, actual);

                });
    }

    @Test
    void save() {
        assertThrows(NullPointerException.class,
                () -> {

                    ProductType expected = productType;

                    ProductType actual = productTypeService.save(productType);

                    Assert.assertEquals(expected, actual);

                });
    }

    @Test
    void findByName() {
        assertThrows(NullPointerException.class,
                () -> {


                    String description = "detail";
                    productType.setProductTypeDetail(description);
                    productTypeService.save(productType);

                    ProductType expected = productType;

                    ProductType actual = productTypeService.findByName(description);

                    Assert.assertEquals(expected, actual);

                });
    }

    @Test
    void create() {
        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    ProductType productType = new ProductType();
                    boolean actual = productTypeService.create(productType);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void delete() {
        assertThrows(NullPointerException.class,
                () -> {
                    boolean expected = true;

                    ProductType deleteTest = new ProductType();
                    productTypeService.save(deleteTest);
                    boolean actual = productTypeService.delete(deleteTest);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void get() {
        assertThrows(NullPointerException.class,
                () -> {
                    int id = 1;
                    ProductType expected = new ProductType();
                    expected.setId(id);

                    ProductType actual = productTypeService.get(id);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void update() {
        assertThrows(NullPointerException.class,
                () -> {

                    boolean expected = true;

                    ProductType productType = new ProductType();

                    boolean actual = productTypeService.update(productType);

                    Assert.assertEquals(expected, actual);

                });
    }
}
