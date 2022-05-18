package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Product;
import com.itlizeSession.joole.Entity.ProductType;
import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Service.ProjectService;
import com.itlizeSession.joole.Service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName ProductTypeServiceImpTest
 * @Description TODO
 * @Author
 * @Date 5/17/22 10:39
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
class ProjectServiceImpTest {


    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;


    private ProductType productType = new ProductType();

    @Test
    void findOneById() {

        Project actual = projectService.get(3);
        Assert.assertTrue(actual != null);
    }

    @Test
    void findAll() {
        Collection<Project> actual = projectService.findAll();
        Assert.assertTrue(actual != null);
    }

    @Test
    void save() {
        Project project = new Project();
        Project actual = projectService.save(project);
        Assert.assertEquals(project, actual);
    }

    @Test
    void create() {
        User user = new User("b", "x","q", null, null,null);
        Project toAdd = new Project(90, user, null, null);
        boolean isSuccessful = projectService.create(toAdd, user);
        Assert.assertTrue(isSuccessful);
    }

    @Test
    void update() {
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
//        Timestamp updateTime = new Timestamp(System.currentTimeMillis());
        User user = new User();
        Project project = new Project(11, null, null, null);
        boolean result = projectService.update(project);
        Assert.assertTrue(result);
    }


    @Test
    void delete() {
        Project toDelete = projectService.get(95);
        boolean isSuccessful = projectService.delete(toDelete);
        Assert.assertTrue(isSuccessful);
    }

}
