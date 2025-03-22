package com.Task.Freelancer_Portfolio_Management.repository;

import com.Task.Freelancer_Portfolio_Management.entity.users.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
}
