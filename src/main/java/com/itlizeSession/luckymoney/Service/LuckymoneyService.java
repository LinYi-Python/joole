package com.itlizeSession.luckymoney.Service;

import com.itlizeSession.luckymoney.Entity.Luckymoney;

import java.util.List;

public interface LuckymoneyService {

    public Luckymoney findOneById(Integer Id);

    List<Luckymoney> findAll();


    public void createTwo();

    public Luckymoney save(Luckymoney luckymoney);

    public List<Luckymoney> findByProducer(String p);
}
