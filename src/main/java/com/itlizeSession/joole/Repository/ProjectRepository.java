package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yang shu
 * 2018-03-11 21:38
 */

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
