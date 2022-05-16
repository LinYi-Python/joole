package com.itlizeSession.joole.Repository;

import java.util.List;

import com.itlizeSession.joole.Entity.Luckymoney;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yang shu
 * 2018-03-11 21:38
 */
// @Repository
public interface LuckmoneyRepository extends JpaRepository<Luckymoney, Integer> {

    List<Luckymoney> findByProducer(String producer);
}
