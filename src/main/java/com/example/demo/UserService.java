package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public Users saveUser(Users user) {
		return userRepo.save(user);
	}

	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}
	

}
