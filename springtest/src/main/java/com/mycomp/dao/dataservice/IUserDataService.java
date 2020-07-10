package com.mycomp.dao.dataservice;

import java.util.List;

import com.mycomp.Model.User;

public interface IUserDataService {
	
	public List<User> getAllUsers();

	public String addUser(User user);

	public String deleteUser(int userId);

	public User getUsersById(int userId);

	public User getUsersById(String userName);

}
