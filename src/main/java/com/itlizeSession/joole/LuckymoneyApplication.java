package com.itlizeSession.joole;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.itlizeSession.joole.Entity.Luckymoney;
import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.Sales;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Repository.SalesRepository;
import com.itlizeSession.joole.Service.LuckymoneyService;

import com.itlizeSession.joole.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LuckymoneyApplication implements CommandLineRunner {

	// @Autowired
	// private LuckymoneyService test;

	@Autowired
	private ProductRepository ProdService;

	@Autowired
	private SalesRepository SaleRep;

	public static void main(String[] args) {
		SpringApplication.run(LuckymoneyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Luckymoney obj = new Luckymoney();
		// obj.setConsumer("AAA");
		// BigDecimal number = new BigDecimal(10);

		// obj.setMoney(number);
		// obj.setProducer("producer!!!");

		// test.save(obj);

		Product product = new Product();
		product.setName("Product AAA");
		product.setProductTypeId(10);
		product.setTechnicalDetailId(20);
		product.setManufacturerDetailId(30);
		product.setModelYear(2020);
		product.setBrand("Toyota");
		product.setCreateTime("2020");
		product.setUpdateTime("2021");

		Sales sale = new Sales("sale Name", "email1", "phone111", "website", 20,
				"createTime 100", "UpdateTime 100");

		product.setSales(sale);
		ProdService.save(product);

		SaleRep.save(sale);



		// product.setSales(sale);
		// List<Product> products = new ArrayList<Product>();

		// products.add(product);

		// sale.setProduct(products);

	}

}
