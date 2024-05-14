package com.luminar.bakeryshopmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luminar.bakeryshopmanagementsystem.entity.User;
import com.luminar.bakeryshopmanagementsystem.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/view-user")
	public ModelAndView getAllItems() {
		ModelAndView mav = new ModelAndView("view_users");
		List<User> userList = userService.getAll();
		mav.addObject("users", userList);
		return mav;
	}
	
	@GetMapping("/add-user")
	public ModelAndView addUser() {		
		ModelAndView mav = new ModelAndView("add_user");
		mav.addObject("command", new User());	
		return mav;
	}
	
	@PostMapping("/save-user")
	public String saveItem(@ModelAttribute User user) {
		userService.save(user);
		return "redirect:/add-user";
	}
	
	@GetMapping("/user-update/{id}")
	public ModelAndView updateUser(@PathVariable("id") Integer id) {
		ModelAndView mav = new ModelAndView("add_user");
		User user = userService.getById(id);
		mav.addObject("command", user);
		return mav;
	}
	
	@GetMapping("/user-delete/{id}")
	public String deleteUser(@PathVariable("id") Integer id) {
		User user = userService.getById(id);
		userService.delete(user);
		return "redirect:/view-user";
	}
	

}
