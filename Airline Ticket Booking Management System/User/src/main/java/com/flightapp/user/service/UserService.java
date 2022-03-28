package com.flightapp.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.user.entity.User;
import com.flightapp.user.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository repo;
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	
	
	


}
