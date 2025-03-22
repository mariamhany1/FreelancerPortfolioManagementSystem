package com.Task.Freelancer_Portfolio_Management.controllers;


import com.Task.Freelancer_Portfolio_Management.entity.users.Freelancer;
import com.Task.Freelancer_Portfolio_Management.repository.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FreelancerController {

    private final FreelancerRepository freelancerRepository;

    @Autowired
    public FreelancerController(FreelancerRepository theFreelancerRepository){
        freelancerRepository = theFreelancerRepository;
    }

    @PostMapping("/register")
    public Freelancer registerFreelancer(@RequestBody Freelancer freelancer){
        Freelancer savedFreelancer = freelancerRepository.save(freelancer);
        return savedFreelancer;
    }
}
