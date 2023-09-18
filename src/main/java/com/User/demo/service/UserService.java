package com.User.demo.service;

import java.util.List;

import com.User.demo.model.User;

public interface UserService {
		boolean saveUserInfo(User user);
		List<User> getUsers();
}
