package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName ProductRepository
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/16/22 02:05
 * @Version 1.0
 **/
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
