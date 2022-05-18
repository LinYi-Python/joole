package com.itlizeSession.joole.Controller;

import com.itlizeSession.joole.Entity.*;
import com.itlizeSession.joole.Service.ProjectProductService;
import com.itlizeSession.joole.Service.ProjectService;
import com.itlizeSession.joole.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.sql.Timestamp;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectProductService projectProductService;

    @GetMapping("/getAllProject")
    public ResponseEntity<?> getAllProject(){
        Collection<Project> result = projectService.findAll();
        List<Project> res = result.stream().collect(toList());

        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @GetMapping("/getOneProject/")
    public ResponseEntity<?> findOneById(@RequestParam("id") Integer id) {
        return new ResponseEntity<>(projectService.findOneById(id), HttpStatus.OK);
    }

    @PostMapping("/save/")
    public ResponseEntity<?> save(@RequestParam("id") Integer id,
                                  @RequestParam("user_id") Integer user_id) {
        User user = userService.findUserById(user_id);
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp updateTime = new Timestamp(System.currentTimeMillis());
        Project project = new Project(id, user, createTime, updateTime);

        return new ResponseEntity<>(projectService.save(project), HttpStatus.OK);
    }

    @PostMapping("/create/")
    public ResponseEntity<?> create(@RequestParam("id") Integer id,
                                    @RequestParam("user_Id") Integer user_Id) {
        User user = userService.findUserById(user_Id);
        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp updateTime = new Timestamp(System.currentTimeMillis());
        Project project = new Project(id, user, createTime, updateTime);

        return new ResponseEntity<>(projectService.create(project, user), HttpStatus.OK);
    }

    @PutMapping("/delete/")
    public ResponseEntity<?> delete(@RequestParam("id") Integer id) {
        Project project = projectService.findOneById(id);
        return new ResponseEntity<>(projectService.delete(project), HttpStatus.OK);
    }

    @PostMapping("/update/")
    public ResponseEntity<?> update(@RequestParam("id") Integer id,
                                    @RequestParam("user_id") Integer user_id) {
        User user = userService.findUserById(user_id);

        Timestamp createTime = new Timestamp(System.currentTimeMillis());
        Timestamp updateTime = new Timestamp(System.currentTimeMillis());
        Project project = new Project(id, user, createTime, updateTime);

        return new ResponseEntity<>(projectService.update(project), HttpStatus.OK);
    }

    @PostMapping("/deleteAll")
    public ResponseEntity<?> deleteAll() {
        return new ResponseEntity<>(projectService.deleteAll(), HttpStatus.OK);
    }

}
