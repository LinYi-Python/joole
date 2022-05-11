package com.itlizeSession.luckymoney.Repository;

import com.itlizeSession.luckymoney.Entity.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by yang shu
 * 2018-03-11 21:38
 */
//@Repository
public interface LuckmoneyRepository extends JpaRepository<Luckymoney, Integer> {


    List<Luckymoney> findByProducer(String producer);
}
