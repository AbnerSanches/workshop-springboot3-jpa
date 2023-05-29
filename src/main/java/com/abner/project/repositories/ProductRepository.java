package com.abner.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abner.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
