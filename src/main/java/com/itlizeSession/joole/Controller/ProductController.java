package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.*;
import com.itlizeSession.joole.Service.*;
import com.itlizeSession.joole.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


/**
 * @ClassName ProductController
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/17/22 13:34
 * @Version 1.0
 **/
@RestController
@RequestMapping("/controller")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductTypeService productTypeService;

    @Autowired
    private TechnicalDetailService technicalDetailService;

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private SaleService saleService;


    /**
     * get all product type for a list
     * @return a list of all product type
     */
    @GetMapping("/getProductType")
    public List<ProductType> getAllProductType(){
        return productTypeService.findAll();
    }

    /**
     *
     * @return
     */
//    public List<Product> getAllProductFromProductType(@RequestParam("ProductType") String productTypeName){
//        return
//    }




}
