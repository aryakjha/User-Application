package com.User.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.User.demo.model.User;

public interface UserRepository  extends JpaRepository<User, Integer> {

}
