package com.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.UserData;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger log = LogManager.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public UserData addUser(@RequestBody UserData userData)
	{
		log.info("Inside addUser().");
		return userService.addUser(userData);
	}
	
	@GetMapping("/{id}")
	public UserData getUserById(@PathVariable int id)
	{
		log.info("Inside getUserById().");
		return userService.getUserById(id);
	}
}
