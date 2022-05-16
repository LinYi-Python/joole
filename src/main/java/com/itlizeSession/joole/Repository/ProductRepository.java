package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yang shu
 * 2018-03-11 21:38
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
