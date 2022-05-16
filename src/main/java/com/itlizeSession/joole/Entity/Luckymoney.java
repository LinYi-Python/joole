package com.itlizeSession.joole.Entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yang shu
 * 2018-03-11 21:10
 */
@Entity
public class Luckymoney {

	@Id
	@GeneratedValue
	private Integer id;

	private BigDecimal money;

	/**
	 * creat producer
	 */

	// @Value("Jack")
	private String producer;

	/**
	 * creat consumer
	 */

	private String consumer;

	public Luckymoney() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
}
