package com.abner.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abner.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
