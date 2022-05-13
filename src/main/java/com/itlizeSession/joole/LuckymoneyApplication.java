package com.itlizeSession.joole;

import com.itlizeSession.joole.Service.impl.LuckymoneyServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LuckymoneyApplication implements CommandLineRunner {

	@Autowired
	private LuckymoneyServiceImp luckymoneyServices;

	public static void main(String[] args) {
		SpringApplication.run(LuckymoneyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		luckymoneyServices.createTwo();
		System.out.println("created two luckymoney objects");
	}

}