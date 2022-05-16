package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Luckymoney;

import java.util.List;

public interface LuckymoneyService {

    public Luckymoney findOneById(Integer Id);

    List<Luckymoney> findAll();


    public void createTwo();

    public Luckymoney save(Luckymoney luckymoney);

    public List<Luckymoney> findByProducer(String p);
}
