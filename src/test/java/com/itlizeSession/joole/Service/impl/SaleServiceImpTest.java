package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Sale;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @ClassName SaleServiceImpTest
 * @Description TODO
 * @Author
 * @Date 5/17/22 10:40
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
class SaleServiceImpTest {

    @Autowired
    private SaleServiceImp saleService;

    private Sale sale = new Sale();

    @Test
    void findOneById() {
        assertThrows(NullPointerException.class,
                () -> {
                    int id = 1;
                    sale.setId(id);

                    Sale expected = sale;

                    Sale actual = saleService.findOneById(id);

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void findAll() {
        assertThrows(NullPointerException.class,
                () -> {
                    List<Sale> expected = new ArrayList<>();
                    //expected.add(sale);

                    List<Sale> actual = saleService.findAll();

                    Assert.assertEquals(expected, actual);
                });
    }

    @Test
    void save() {
        assertThrows(NullPointerException.class,
                () -> {
                    Sale expected = sale;

                    Sale actual = saleService.save(sale);

                    Assert.assertEquals(expected, actual);
                });
    }
}