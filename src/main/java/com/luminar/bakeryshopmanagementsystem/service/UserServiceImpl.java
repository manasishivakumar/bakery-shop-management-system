package com.luminar.bakeryshopmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.bakeryshopmanagementsystem.entity.User;
import com.luminar.bakeryshopmanagementsystem.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User save(User user) {
		return userRepository.save(user);
		
	}
	
	@Override
	public User getById(Integer id) {
		return userRepository.findById(id).get();

	}
	
	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}
	
	@Override
	public User findUserByUserName(String username) {
        return userRepository.findByUserName(username);
    }

}
