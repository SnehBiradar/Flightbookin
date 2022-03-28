package com.flightapp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.user.entity.User;
import com.flightapp.user.service.IUserService;
import com.flightapp.user.service.UserService;

@RestController
public class UserController {
	@Autowired 
	private IUserService userService;
	
//post method 
	@PostMapping
	public String getUser(@RequestBody User user) {
		
		userService.saveUser(user);
		return "User Saved";

}
}