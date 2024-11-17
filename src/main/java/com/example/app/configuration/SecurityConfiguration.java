package com.example.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration 
{

	
	
	
	@Bean
   public PasswordEncoder encoder()
   {
	   
	   return new BCryptPasswordEncoder();
   }
	
	
	
	
	
	public SecurityFilterChain filerChain(HttpSecurity http) throws Exception
	{
		
		
		http.csrf().disable()
		.authorizeRequests()
		.antMatchers("/student").hasAnyAuthority("STUDENT" , "ADMIN")
		.antMatchers("/employee").hasAnyAuthority("EMPLOYEE" , "ADMIN")
		.antMatchers("/home").permitAll()
		.antMatchers("/welcome").permitAll()
		.antMatchers("/admin").hasAuthority("ADMIN")
		.and()
		.formLogin()
		.and()
		.httpBasic();
		
		return http.build();
		
		

		
		
		
	}	
}
