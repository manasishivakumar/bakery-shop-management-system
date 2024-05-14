package com.luminar.bakeryshopmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luminar.bakeryshopmanagementsystem.entity.User;
import com.luminar.bakeryshopmanagementsystem.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showLoginForm() {
		return "login"; 
	}
	
	@GetMapping("/login")
    public String login(@RequestParam("userName") String userName) {
		User user = userService.findUserByUserName(userName);
		if (user.getUserRole().equals("Admin")) {
			return "index";
		}else if (user.getUserRole().equals("Cashier")) {
			return "cashier_home";
		}

		return "login";
		
	}
	
	@GetMapping("/cashier-home")
	public String cashierHome() {
		return "cashier_home"; 
	}
	
	@GetMapping("/admin-home")
	public String AdminHome() {
		return "index"; 
	}
                               

	

	
}
