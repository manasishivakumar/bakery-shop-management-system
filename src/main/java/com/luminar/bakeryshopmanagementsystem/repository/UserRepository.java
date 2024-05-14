package com.luminar.bakeryshopmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luminar.bakeryshopmanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String username);
}
