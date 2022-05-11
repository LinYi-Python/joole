package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yang shu
 * 2018-03-11 21:38
 */
//@Repository
public interface LuckmoneyRepository extends JpaRepository<Luckymoney, Integer> {


    List<Luckymoney> findByProducer(String producer);
}
