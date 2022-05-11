package com.itlizeSession.joole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LuckymoneyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckymoneyApplication.class, args);
	}

}
