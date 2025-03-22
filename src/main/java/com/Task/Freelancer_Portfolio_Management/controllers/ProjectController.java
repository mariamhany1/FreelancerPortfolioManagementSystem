package com.Task.Freelancer_Portfolio_Management.controllers;

import com.Task.Freelancer_Portfolio_Management.entity.Project;
import com.Task.Freelancer_Portfolio_Management.entity.users.Freelancer;
import com.Task.Freelancer_Portfolio_Management.repository.FreelancerRepository;
import com.Task.Freelancer_Portfolio_Management.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/portfolio")
public class ProjectController {
    private final ProjectRepository projectRepository;
    private final FreelancerRepository freelancerRepository;

    @Autowired
    public ProjectController(ProjectRepository theProjectRepository, FreelancerRepository theFreelancerRepository){
        projectRepository = theProjectRepository;
        freelancerRepository = theFreelancerRepository;
    }

    @PostMapping("/add")
    public Project addProject(@RequestBody Project project){
        Optional<Freelancer> freelancer = freelancerRepository.findById(project.getFreelancer().getId());
        project.setFreelancer(freelancer.get());
        Project savedProject = projectRepository.save(project);
        return savedProject;
    }
}
