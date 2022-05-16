package com.itlizeSession.joole.Controller;

//import com.itlizeSession.luckymoney.Config.LimitConfig;
import com.itlizeSession.joole.Entity.Luckymoney;
import com.itlizeSession.joole.Service.LuckymoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yang shu
 * 2018-03-11 21:35
 */
@RestController
@RequestMapping("/controller")
public class LuckymoneyController {



	@Autowired
	private LuckymoneyService service;

//	@Autowired
//	private LimitConfig limitConfig;

	/**
	 * get all luckymoney from database
	 */
	@GetMapping("/luckymoneys")
	public List<Luckymoney> list() {
		return service.findAll();
	}

	/**
	 * creat a luckymoney
	 */
	@PostMapping("/luckymoneys")
	public Luckymoney create(@RequestParam("producer") String producer,
							 @RequestParam("money") BigDecimal money,
	                         @RequestParam("consumer") String consumer) {
		Luckymoney luckymoney = new Luckymoney();
		luckymoney.setProducer(producer);
		luckymoney.setMoney(money);
		luckymoney.setConsumer(consumer);
		return service.save(luckymoney);
	}

	/**
	 * find a luckymoney by its id
	 */
	@GetMapping("/luckymoneys/")
	public Luckymoney findById(@RequestParam("id") Integer id) {
		return service.findOneById(id);
	}

	/**
	 * updated a luckmoney information
	 */
	@PutMapping("/luckymoneys/")
	public Luckymoney update(@RequestParam("id") Integer id,
							 @RequestParam("consumer") String consumer) {
		Luckymoney luckymoney= service.findOneById(id);
		luckymoney.setConsumer(consumer);
			return service.save(luckymoney);
		}


	@PostMapping("/luckymoneys/two")
	public void createTwo() {
		service.createTwo();
	}
}
