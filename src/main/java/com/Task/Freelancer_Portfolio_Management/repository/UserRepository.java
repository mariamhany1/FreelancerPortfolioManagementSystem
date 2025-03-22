package com.Task.Freelancer_Portfolio_Management.repository;

import com.Task.Freelancer_Portfolio_Management.entity.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
