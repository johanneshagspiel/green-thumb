package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.User;

public interface UserService {

	public List<User> getUsers();

	public void saveUser(User theUser);

	public User getUser(int theId);

	public void deleteUser(int theId);

	public User getUser2(String user_name, String password);

	public User getUser3(String user_name);
}
