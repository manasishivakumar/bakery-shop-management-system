package com.luminar.bakeryshopmanagementsystem.service;

import java.util.List;

import com.luminar.bakeryshopmanagementsystem.entity.User;

public interface UserService {
	
	List<User> getAll();
	
	User save(User user);
	
	User getById(Integer id);
	
	void delete(User user);
	
	User findUserByUserName(String username);

}
