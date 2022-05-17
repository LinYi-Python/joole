package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Service.ProjectService;
import com.itlizeSession.joole.Service.UserService;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceImpTest {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private UserService userService;

    @org.junit.jupiter.api.Test
    void findOneById() {
        int id = 1;
        Project project = new Project();
        project.setId(1);
        Project actual = projectService.findOneById(id);
        Assert.assertEquals(project, actual);
    }

    @org.junit.jupiter.api.Test
    void findAll() {
        Collection<Project> expected = new HashSet<>();
        Project project = new Project();
        expected.add(project);
        Collection<Project> actual = projectService.findAll();
        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void save() {
        Project project = new Project();
        Project actual = projectService.save(project);
        Assert.assertEquals(project, actual);
    }

    @org.junit.jupiter.api.Test
    void create() {
        Project toAdd = new Project();
        User user = userService.findUserById(0);
        toAdd.setId(0);
        boolean isSuccessful = projectService.create(toAdd, user);
        Assert.assertTrue(isSuccessful);
    }

    @org.junit.jupiter.api.Test
    void update() {
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp updateTime = new Timestamp(System.currentTimeMillis());
        User user = new User();
        Project project =  new Project(2, user, createTime, updateTime);
        boolean result = projectService.update(project);
        Assert.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void delete() {
        Project toDelete = projectService.get(1);
        System.out.println("deleting" + toDelete.getId());
        boolean isSuccessful = projectService.delete(toDelete);
        Assert.assertTrue(isSuccessful);
    }

    @org.junit.jupiter.api.Test
    void get() {
        Project res = projectService.get(0);
        Assert.assertTrue(res != null);
    }

    @org.junit.jupiter.api.Test
    void deleteAll() {
        boolean isSuccessful = projectService.deleteAll();
        Assert.assertTrue(isSuccessful);
    }

}
