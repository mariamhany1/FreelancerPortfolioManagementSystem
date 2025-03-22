package com.Task.Freelancer_Portfolio_Management.repository;

import com.Task.Freelancer_Portfolio_Management.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
