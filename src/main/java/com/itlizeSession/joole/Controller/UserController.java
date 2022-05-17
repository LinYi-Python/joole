//package com.itlizeSession.joole.Controller;
//
//import com.itlizeSession.joole.Entity.*;
//import com.itlizeSession.joole.Repository.UserRepository;
//import com.itlizeSession.joole.Service.*;
//import com.itlizeSession.joole.Service.ProductService;
//import com.itlizeSession.joole.Service.impl.UserServiceImp;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * @ClassName ProductController
// * @Description TODO
// * @Author Yi Lin
// * @Date 5/17/22 13:34
// * @Version 1.0
// **/
//@RestController
//@RequestMapping("/controller")
//public class UserController {
//
//    @Autowired
//    private UserServiceImp userService;
//
//    @GetMapping("/users")
//    public ResponseEntity<?> createUser(@RequestParam("username") String username, @RequestParam("password") String password) {
//
//        boolean createUser = userService.createUser(username, password);
//
//        return new ResponseEntity<>(createUser, HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<?> delete(@RequestParam("password") String password, @RequestParam("id") int id) {
//
//        boolean delete = userService.delete(password, id);
//
//        return new ResponseEntity<>(delete, HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<?> findUserById(@RequestParam("id") int id) {
//
//        User user = userService.findUserById(id);
//
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<?> userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
//
//        boolean userLogin = userService.userLogin(username, password);
//
//        return new ResponseEntity<>(userLogin, HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<?> updateUser(@RequestParam("user") User user) {
//
//        boolean updateUser = userService.updateUser(user);
//
//        return new ResponseEntity<>(updateUser, HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<?> userLogout() {
//
//        boolean userLogout = userService.userLogout();
//
//        return new ResponseEntity<>(userLogout, HttpStatus.OK);
//    }
//
//    @GetMapping("/users")
//    public ResponseEntity<?> addProject(@RequestParam("project") Project project, @RequestParam("user") User user) {
//
//        boolean addProject = userService.addProject(project, user);
//
//
//        return new ResponseEntity<>(addProject, HttpStatus.OK);
//    }
//
//
//}
