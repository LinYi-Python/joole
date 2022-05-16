package com.itlizeSession.joole;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.itlizeSession.joole.Entity.Luckymoney;
import com.itlizeSession.joole.Entity.Manufacturer;
import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.Sales;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Repository.ManufacturerRepository;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Repository.ProductTypeRepository;
import com.itlizeSession.joole.Repository.TechnicalDetailRepository;
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

	@Autowired
	private ManufacturerRepository ManuRepository;

	@Autowired
	private ProductTypeRepository ProductTypeRepository;

	@Autowired
	private TechnicalDetailRepository TechnicalDetailRepository;

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

		// ! Working Product
		Product product = new Product();
		product.setName("Product BBB");
		// product.setProductTypeId(10);
		// product.setTechnicalDetailId(20);
		// product.setManufacturerDetailId(30);
		product.setModelYear(2020);
		product.setBrand("Toyota");
		product.setCreateTime(new Timestamp(System.currentTimeMillis()));
		product.setUpdateTime(new Timestamp(System.currentTimeMillis()));

		// ! Working sale
		Sales sale = new Sales("sale Name", "email1", "phone111", "website", 20,
				new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()));

		// ! Working manufacturer
		Manufacturer manufacturer = new Manufacturer("username", "password", "department", "phone", "email",
				"Website", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()));

		// ! Working ProductType
		ProductType productType = new ProductType("ProductTypeDetails", new Timestamp(System.currentTimeMillis()));

		// * May need to remove productTypeID Instance variable for is already
		// * generating FK
		TechnicalDetail technicalDetail = new TechnicalDetail("technical name test",
				3, 5, new Timestamp(System.currentTimeMillis()),
				new Timestamp(System.currentTimeMillis()));

		System.out.println("\nInserting into DataBase \n");

		SaleRep.save(sale);
		ManuRepository.save(manufacturer);
		ProductTypeRepository.save(productType);

		// setting all relationships for technicalDetail
		technicalDetail.setProductType(productType);

		TechnicalDetailRepository.save(technicalDetail);

		// setting all relationships for product
		product.setSales(sale);
		product.setManufacturer(manufacturer);
		product.setProductType(productType);
		product.setTechnicalDetail(technicalDetail);

		ProdService.save(product);

	}

}
