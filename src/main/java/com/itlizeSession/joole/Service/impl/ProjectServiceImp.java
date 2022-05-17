package com.itlizeSession.joole.Service.impl;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.User;
import com.itlizeSession.joole.Repository.ProjectProductRepository;
import com.itlizeSession.joole.Repository.ProjectRepository;
import com.itlizeSession.joole.Repository.UserRepository;
import com.itlizeSession.joole.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;


@Service
public class ProjectServiceImp implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProjectProductRepository projectProductRepository;

    @Override
    public Project findOneById(Integer Id){
        return projectRepository.findById(Id).orElse(null);
    }

    @Override
    public Collection<Project> findAll(){
        return projectRepository.findAll();
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public boolean create(Project project, User user) {
        if (project == null || user == null) {
            System.out.println("Null input");
            return false;
        }
        Project target = findOneById(project.getId());
        if (target != null) {
            System.out.println("Project already exists");
        }

        try {
            projectRepository.save(project);

            boolean exit = user.getProjects().add(project);
            if (exit) {
                return false;
            }
            userRepository.addProject(project, user);
            userRepository.save(user);

        } catch (Exception e){
            System.out.println("something wrong happens when creating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Project project) {
        if (project == null) {
            System.out.println("input is null");
            return false;
        }
        try{
            projectRepository.delete(project);
        }catch (Exception e){
            System.out.println("something wrong happens when creating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Project project) {
        if (project == null) {
            System.out.println("input is null");
            return false;
        }
        try {
            projectRepository.save(project);
        } catch (Exception e) {
            System.out.println("something wrong happens when updating" + e.getMessage());
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteAll(){
        try{
            projectRepository.deleteAll();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Project get(Integer id) {
        if (id == null) {
            return null;
        }
        Optional<Project> result = projectRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }else{
            return null;
        }
    }
}
