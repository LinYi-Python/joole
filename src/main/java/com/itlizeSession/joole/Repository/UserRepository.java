package com.itlizeSession.joole.Repository;

import com.itlizeSession.joole.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yang shu
 * 2018-03-11 21:38
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(int id);
    

    User findUserByUserName(String userName);
    //findUserByUsername

//    //addProject
//    User addProject(Project project, User user);
}
