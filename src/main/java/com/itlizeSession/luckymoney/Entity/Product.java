package com.itlizeSession.luckymoney.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/11/22 00:22
 * @Version 1.0
 **/
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "product_type_id", length = 20)
    private Integer productTypeId;

    
}
