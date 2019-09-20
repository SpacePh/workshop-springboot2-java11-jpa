package com.spaceph.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spaceph.workshopjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
