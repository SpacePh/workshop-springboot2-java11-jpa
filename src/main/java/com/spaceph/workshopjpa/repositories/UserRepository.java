package com.spaceph.workshopjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spaceph.workshopjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
