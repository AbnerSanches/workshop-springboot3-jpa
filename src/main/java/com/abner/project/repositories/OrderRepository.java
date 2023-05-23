package com.abner.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abner.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
