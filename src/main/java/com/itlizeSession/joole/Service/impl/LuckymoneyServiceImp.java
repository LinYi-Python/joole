package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Luckymoney;
import com.itlizeSession.joole.Repository.LuckmoneyRepository;
import com.itlizeSession.joole.Service.LuckymoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yang shu
 * 2018-03-12 01:39
 */
@Service
public class LuckymoneyServiceImp implements LuckymoneyService {

	@Autowired
	private LuckmoneyRepository repository;

	@Override
	public Luckymoney findOneById(Integer Id) {
		return repository.findById(Id).orElse(null);
	}

	@Override
	public List<Luckymoney> findAll() {
		return repository.findAll();
	}

	/**
	 * Transaction
	 * inventory > order
	 */
	@Transactional
	public void createTwo() {
		Luckymoney luckymoney1 = new Luckymoney();
		luckymoney1.setProducer("AAAAA");
		luckymoney1.setMoney(new BigDecimal("333"));
		luckymoney1.setConsumer("MOM");
		repository.save(luckymoney1);

		Luckymoney luckymoney2 = new Luckymoney();
		luckymoney2.setProducer("dsadsau");
		luckymoney2.setMoney(new BigDecimal("13333"));
		luckymoney2.setConsumer("MOM");
		repository.save(luckymoney2);
	}

	@Override
	public Luckymoney save(Luckymoney luckymoney) {
		return repository.save(luckymoney);

	}

	@Override
	public List<Luckymoney> findByProducer(String p) {
		return repository.findByProducer(p);
	}
}
