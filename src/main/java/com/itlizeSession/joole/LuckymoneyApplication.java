package com.itlizeSession.joole;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.itlizeSession.joole.Entity.Luckymoney;
import com.itlizeSession.joole.Entity.Manufacturer;
import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.ProjectProduct;
import com.itlizeSession.joole.Entity.Sales;
import com.itlizeSession.joole.Entity.TechnicalDetail;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Repository.ManufacturerRepository;
import com.itlizeSession.joole.Repository.ProductRepository;
import com.itlizeSession.joole.Repository.ProductTypeRepository;
import com.itlizeSession.joole.Repository.TechnicalDetailRepository;
import com.itlizeSession.joole.Repository.UserRepository;
import com.itlizeSession.joole.Repository.SalesRepository;
import com.itlizeSession.joole.Repository.ProjectProductRepository;
import com.itlizeSession.joole.Repository.ProjectRepository;

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
	private ProductRepository ProductRepository;

	@Autowired
	private SalesRepository SaleRep;

	@Autowired
	private ManufacturerRepository ManuRepository;

	@Autowired
	private ProductTypeRepository ProductTypeRepository;

	@Autowired
	private TechnicalDetailRepository TechnicalDetailRepository;

	@Autowired
	private ProjectProductRepository ProjectProductRepository;

	@Autowired
	private ProjectRepository ProjectRepository;

	@Autowired
	private UserRepository userRepository;

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
		product.setName("Product 1 AAA");
		product.setModelYear(2020);
		product.setBrand("Toyota");
		product.setCreateTime(new Timestamp(System.currentTimeMillis()));
		product.setUpdateTime(new Timestamp(System.currentTimeMillis()));

		Product product1 = new Product();
		product1.setName("Product 2 BBB");
		product1.setModelYear(2020);
		product1.setBrand("Toyota");
		product1.setCreateTime(new Timestamp(System.currentTimeMillis()));
		product1.setUpdateTime(new Timestamp(System.currentTimeMillis()));

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
		// ! Working Technical Detail
		TechnicalDetail technicalDetail = new TechnicalDetail("technical name test",
				3, 5, new Timestamp(System.currentTimeMillis()),
				new Timestamp(System.currentTimeMillis()));

		// ! Working Project Product
		ProjectProduct pProduct = new ProjectProduct(10, 20);

		// ! Working Project
		Project project = new Project(14, new Timestamp(System.currentTimeMillis()),
				new Timestamp(System.currentTimeMillis()));

		User user = new User("username", " password", "name", "Picture for Profile URL",
				new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()));

		System.out.println("\nInserting into DataBase \n");

		SaleRep.save(sale);
		ProductRepository.save(product);
		ProductRepository.save(product1);

		userRepository.save(user);
		ProjectRepository.save(project);

		ProductTypeRepository.save(productType);

		// setting all relationships for technicalDetail
		technicalDetail.setProductType(productType);
		TechnicalDetailRepository.save(technicalDetail);

		// setting all relationships for Manufacture
		manufacturer.addProducts(product);
		manufacturer.addProducts(product1);
		ManuRepository.save(manufacturer);

		// setting all relationships for Project Product
		pProduct.setProject(project);
		ProjectProductRepository.save(pProduct);

		// setting all relationships for Project
		project.setUser(user);
		ProjectRepository.save(project);

		// setting all relationships for product
		product.setSales(sale);
		product.setManufacturer(manufacturer);
		product.setProductType(productType);
		product.setTechnicalDetail(technicalDetail);
		product.setProjectProduct(pProduct);

		ProductRepository.save(product);

	}

}
