package com.mycomp.service;

import java.util.List;

import com.mycomp.Model.User;

public interface IUserService {
	
	public List<User> getAllUsers();

	public String addUser(User user);

	public String deleteUser(int userId);

	public User getUsersByName(String userName);

	public User getUsersById(int userId);

}
