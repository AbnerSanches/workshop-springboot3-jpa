package com.abner.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abner.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
