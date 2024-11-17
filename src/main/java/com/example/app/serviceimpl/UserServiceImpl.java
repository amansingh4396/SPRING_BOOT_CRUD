package com.example.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.app.model.User;
import com.example.app.repository.UserRepository;
import com.example.app.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{

	private UserRepository repository ;

	public UserServiceImpl(UserRepository repository) 
	{
		super();
		this.repository = repository;
	}

	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public Integer saveUser(User user) 
	{
	String encodedPassword = encoder.encode(user.getUserPassword());
		
	user.setUserPassword(encodedPassword);
		
	return repository.save(user).getUserId();
		
	}
	
	
	
	
}
