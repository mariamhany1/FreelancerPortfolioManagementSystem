package com.Task.Freelancer_Portfolio_Management.entity.users;

import jakarta.persistence.Entity;

@Entity
public class Freelancer extends User {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
