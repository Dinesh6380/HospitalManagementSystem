package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class Loginservice {
	@Autowired
	private LoginRepository repo;
	public Login login(String uname,String password,String role)
	{
		Login user = repo.findByUnameAndPasswordAndRole(uname, password,role);
		return user;
		
	}
	public void save(Login login)
	{
		repo.save(login);
	}
 
}
