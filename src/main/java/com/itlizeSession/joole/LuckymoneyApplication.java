package com.itlizeSession.joole;

import java.math.BigDecimal;

import com.itlizeSession.joole.Entity.Luckymoney;
import com.itlizeSession.joole.Service.LuckymoneyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LuckymoneyApplication implements CommandLineRunner {

	@Autowired
	private LuckymoneyService test;

	public static void main(String[] args) {
		SpringApplication.run(LuckymoneyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Luckymoney obj = new Luckymoney();
		obj.setConsumer("AAA");
		BigDecimal number = new BigDecimal(10);

		obj.setMoney(number);
		obj.setProducer("producer!!!");

		test.save(obj);

	}

}
