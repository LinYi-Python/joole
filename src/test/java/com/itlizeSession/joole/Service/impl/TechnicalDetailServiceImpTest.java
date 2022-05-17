package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.TechnicalDetail;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName TechnicalDetailServiceImpTest
 * @Description TODO
 * @Author
 * @Date 5/17/22 10:40
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
class TechnicalDetailServiceImpTest {

    @Autowired
    private TechnicalDetailServiceImp technicalService;


    private TechnicalDetail technicalDetail = new TechnicalDetail();


    @Test
    void findOneById() {
        assertThrows(NullPointerException.class,
                () -> {
                    int id = 1;
                    technicalDetail.setId(id);
                    TechnicalDetail expected = technicalDetail;

                    TechnicalDetail actual = technicalService.findOneById(id);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void findAll() {
        assertThrows(NullPointerException.class,
                () -> {
                    List<TechnicalDetail> expected = new ArrayList<>();
                    //expected.add(technicalDetail);

                    List<TechnicalDetail> actual = technicalService.findAll();

                    Assert.assertEquals(expected, actual);
                });



    }

    @Test
    void save() {

        assertThrows(NullPointerException.class,
                () -> {
                    TechnicalDetail expected = technicalDetail;

                    TechnicalDetail actual = technicalService.save(technicalDetail);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void getTechnicalDetailByName() {
        assertThrows(NullPointerException.class,
                () -> {
                    String test = "airflow";

                    List<TechnicalDetail> expected = new ArrayList<>();
                    TechnicalDetail t1 = technicalService.findOneById(1);
                    TechnicalDetail t2 = technicalService.findOneById(5);
                    expected.add(t1);
                    expected.add(t2);

                    List<TechnicalDetail> actual = technicalService.getTechnicalDetailByName(test);

                    Assert.assertEquals(expected, actual);
                });



    }
}