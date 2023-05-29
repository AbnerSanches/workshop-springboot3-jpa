package com.abner.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abner.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
