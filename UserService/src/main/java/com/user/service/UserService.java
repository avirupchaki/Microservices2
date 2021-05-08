package com.user.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.UserData;
import com.user.repository.UserRepository;

@Service
public class UserService {

	private static final Logger log = LogManager.getLogger(UserService.class);
	
	@Autowired
	private UserRepository repository;
	
	public UserData addUser(UserData userData)
	{
		log.info("Inside addUser().");
		return repository.save(userData);
	}
	
	public UserData getUserById(int id)
	{
		log.info("Inside getUserById().");
		return repository.findById(id).orElse(new UserData());
	}
}
