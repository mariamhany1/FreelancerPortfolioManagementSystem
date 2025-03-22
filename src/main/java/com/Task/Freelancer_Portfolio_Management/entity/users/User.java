package com.Task.Freelancer_Portfolio_Management.entity.users;

import com.Task.Freelancer_Portfolio_Management.entity.users.BaseUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseUser {
}
