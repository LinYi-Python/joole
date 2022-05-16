package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Repository.TechnicalDetailRepository;
import com.itlizeSession.joole.Repository.ProductTypeRepository;
import com.itlizeSession.joole.Service.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName TechnicalDetailServiceImp
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/16/22 03:22
 * @Version 1.0
 **/
public class TechnicalDetailServiceImp implements  TechnicalDetailService{

    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;

    @Autowired
    private ProductTypeRepository productTypeRepository;

    @Override
    public TechnicalDetail findOneById(Integer Id){
        return technicalDetailRepository.findById(Id).orElse(null);
    }

    @Override
    public List<TechnicalDetail> findAll(){
        return technicalDetailRepository.findAll();
    }

    @Override
    public TechnicalDetail save(TechnicalDetail technicalDetail){
        return technicalDetailRepository.save(technicalDetail);
    }

    @Override
    public List<TechnicalDetail> getTechnicalDetailByName(String name){
        //name is productType name
        ProductType productType = productTypeRepository.getProductTypeByProductTypeDetail(name);
        return technicalDetailRepository.getTechnicalDetailByProductType(productType);
    }
}
