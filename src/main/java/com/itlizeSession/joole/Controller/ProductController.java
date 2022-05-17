package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.*;
import com.itlizeSession.joole.Service.*;
import com.itlizeSession.joole.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getAllProductType(){
        List<ProductType> productTypesList = productTypeService.findAll();

        return new ResponseEntity<>(productTypesList, HttpStatus.OK);
    }

    /**
     * get all product list for one product type
     * @return a list of all product type
     */
    public ResponseEntity<?> getAllProductFromProductType(@RequestParam("ProductType") String productTypeName){
        List<Product> productList = productService.findProducesByProductType(productTypeName);

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

//    /**
//     *
//     */
//    public ResponseEntity<?> createProduct(){
//
//    }
//
//    /**
//     *
//     */
//    public ResponseEntity<?> updateProduct(){
//
//    }
//
//    /**
//     *
//     */
//    public ResponseEntity<?> getProductById(){
//
//    }
//
//    /**
//     *
//     */
//    public ResponseEntity<?> deleteProductById(){
//
//    }
//
//
//    /**
//     * @Return return TechnicalDetail information
//     */
//    public ResponseEntity<?> getProductTechnicalDetailById(){
//
//    }
//
//    /**
//     * @Return return one product its manufacturerInformation and sale information
//     */
//    public ResponseEntity<?>  getProductManufacturerAndSaleById(){
//
//    }
//
//    public ResponseEntity<?> getAllProductFromProductTypeAndTechnicalDetail(){
//
//    }
//
//    public ResponseEntity<?> getAllProductFromProductTypeAndTechnicalDetailAndModelYearAndBrand(){
//
//    }



}
