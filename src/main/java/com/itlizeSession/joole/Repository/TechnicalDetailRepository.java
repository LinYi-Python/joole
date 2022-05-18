package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName TechnicalDetailRepository
 * @Description TODO
 * @Author Yi Lin
 * @Date 5/16/22 02:09
 * @Version 1.0
 **/
public interface TechnicalDetailRepository extends JpaRepository<TechnicalDetail, Integer>{
    public TechnicalDetail getTechnicalDetailByTechnicalDetailName(String name);
    public List<TechnicalDetail> getTechnicalDetailByProductType(ProductType productType);
    public TechnicalDetail getTechnicalDetailById(Integer id);
}
