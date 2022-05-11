package com.itlizeSession.luckymoney.Service.impl;

import com.itlizeSession.luckymoney.Entity.Luckymoney;
import com.itlizeSession.luckymoney.Repository.LuckmoneyRepository;
import com.itlizeSession.luckymoney.Service.LuckymoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
	 *  inventory > order
	 */
	@Transactional
	public void createTwo() {
		Luckymoney luckymoney1 = new Luckymoney();
		luckymoney1.setProducer("Yang Shu");
		luckymoney1.setMoney(new BigDecimal("520"));
		luckymoney1.setConsumer("MOM");
		repository.save(luckymoney1);

		Luckymoney luckymoney2 = new Luckymoney();
		luckymoney2.setProducer("Yang Shu");
		luckymoney2.setMoney(new BigDecimal("1314"));
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
