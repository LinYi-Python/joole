package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.*;import com.itlizeSession.joole.Entity.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

/**
 * @ClassName ProductServiceImpTest
 * @Description TODO
 * @Author
 * @Date 5/16/22 15:43
 * @Version 1.0
 **/
class ProductServiceImpTest {

    @org.junit.jupiter.api.Test
    void findOneById() {

    }

    @org.junit.jupiter.api.Test
    void findAll() {
    }

    @org.junit.jupiter.api.Test
    void save() {
    }

    @org.junit.jupiter.api.Test
    void create() {

        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp updateTime = new Timestamp(System.currentTimeMillis());
        Product product = new Product("Test1", 2022, "Meta", createTime, updateTime);
        Manufacturer manufacturer = new Manufacturer()

    }

    @org.junit.jupiter.api.Test
    void update() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void deleteAll() {
    }

    @org.junit.jupiter.api.Test
    void findProducesByProductType() {
    }

    @org.junit.jupiter.api.Test
    void findProductsByProductTypeAndTechnicalDetail() {
    }

    @org.junit.jupiter.api.Test
    void findProductsByProductTypeAndTechnicalDetailAndModelYearAndBrand() {
    }
}