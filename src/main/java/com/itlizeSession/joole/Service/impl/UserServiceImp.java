package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.*;
import com.itlizeSession.joole.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.itlizeSession.joole.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository repository;
    
    @Autowired 
    private ProjectRepository projectRepository;

    public boolean createUser(String username, String password) {

        User user = new User();
        user.setUserName(username);
        user.setPassword(password);

        try {
            repository.save(user);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            e.printStackTrace();
            return false;
        }

        return true;

    }

    public boolean delete(String password, int id) {

        User target = findUserById(id);

        if (target == null || !target.getPassword().equals(password)) {
            return false;
        } else {

            try {
                repository.deleteById(id);
            } catch (Exception e) {
                System.out.println("" + e.getMessage());
                e.printStackTrace();
                return false;
            }

            return true;
        }


    }

    public User findUserById(int id) {
        return repository.findById(id).orElse(null);
    }

    //return true if user password and username exists, else false
    public boolean userLogin(String username, String password) {

        User target = repository.findUserByUsername(username);

        if (target == null || !target.getPassword().equals(password) || !target.getUserName().equals(username)) {
            return false;
        } else {

            try {
                System.out.println("\nUser Login: " + target.getUserName() + " " + target.getPassword() + " was successfull");
            } catch (Exception e) {
                System.out.println("" + e.getMessage());
                e.printStackTrace();
                return false;
            }

            return true;
        }


    }

    public boolean updateUser(User user) {

        try {
            repository.save(user);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            e.printStackTrace();
            return false;
        }

        return true;


    }

    //Return System.out.println saying the user was logged out successfully
    public boolean UserLogout() {


        try {
            System.out.println("\nUser Logged out");
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean addProject(Project project, User user) {
        try {
            project.setUser(user);
            repository.save(user);
            projectRepository.save(project);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
