package com.example.app.rest;

import javax.persistence.Id;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.User;
import com.example.app.service.UserService;

@RestController
public class HomeController 
{
	
	private UserService service ;
	

	public HomeController(UserService service) {
		super();
		this.service = service;
	}

	
	@PostMapping(value = "/users")
    public String addUser(@RequestBody User user)
    {
    	Integer  id = service.saveUser(user);
    	
    	return "User Added" + id ;
    }
	
	
	
	
	@RequestMapping(value = "/welcome")
	public String welcomePage()
	{
		String msg = "welcome method called" ;
		return msg ;
	}
	
	@RequestMapping(value = "/home")
	public String homePage()
	{
		String msg = "Home method called" ;
		return msg ;
	}
	
	@RequestMapping(value = "/employee")
	public String employeePage()
	{
		String msg = "employee method called" ;
		return msg ;
	}
	
	
	@RequestMapping(value = "/student")
	public String studentPage()
	{
		String msg = "Student method called" ;
		return msg ;
	}
	
	@RequestMapping(value = "/admin")
	public String adminPage()
	{
		String msg = "admin method called" ;
		return msg ;
	}
	
	
}
