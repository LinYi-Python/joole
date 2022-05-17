package com.itlizeSession.joole.Service;

import com.itlizeSession.joole.Entity.Project;
import com.itlizeSession.joole.Entity.User;

import java.util.Collection;

public interface ProjectService {
    public Project findOneById(Integer Id);

    public Collection<Project> findAll();

    public Project save(Project project);

    public boolean create(Project project, User user);

    public boolean delete(Project project);

    public boolean update(Project project);

    public void deleteAll();
    public Project get(Integer id);
}
