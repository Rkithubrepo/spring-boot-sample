/**
 * 
 */
package com.example.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.User;

/**
 * 
 */
@RestController
public class UserController {
    @GetMapping(value = "/users")
	public List<User> getAllUsers() {

		List<User> users = new ArrayList<>();
		
		User u1 = new User(1,"Sriram","K","Ayodhya");
		User u2 = new User(2,"Sairam","K","Shirdi");
		users.add(u1);
		users.add(u2);
//		User u3 = new User();
		return users;
	}

}
