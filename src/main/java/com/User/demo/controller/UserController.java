package com.User.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.User.demo.model.User;
import com.User.demo.service.UserService;

@RestController
@RequestMapping(path = "/all")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/save")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		if(userService.saveUserInfo(user)) {
			return new ResponseEntity<>("Data Saved in the Database" , HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Data Not Saved in the Database", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/get")
	public ResponseEntity<List<User>> getAllUser() {
		return  new ResponseEntity<>(userService.getUsers(),HttpStatus.OK);
	}

}
