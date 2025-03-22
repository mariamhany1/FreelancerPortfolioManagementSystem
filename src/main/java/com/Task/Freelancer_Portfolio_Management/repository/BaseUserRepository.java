package com.Task.Freelancer_Portfolio_Management.repository;

import com.Task.Freelancer_Portfolio_Management.entity.users.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BaseUserRepository extends JpaRepository<BaseUser, Long> {
}
