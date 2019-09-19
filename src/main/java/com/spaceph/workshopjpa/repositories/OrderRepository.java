package com.spaceph.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spaceph.workshopjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
