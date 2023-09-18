package com.User.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.demo.dao.UserRepository;
import com.User.demo.model.User;


@Service
public class UserServiceImpl implements UserService{
		
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean saveUserInfo(User user) {
		
		User u = userRepository.save(user);
		try {
			if(u != null) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		catch(Exception e) {
			
		}
		
		return false;
	}
	
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
}