package com.spaceph.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spaceph.workshopjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
