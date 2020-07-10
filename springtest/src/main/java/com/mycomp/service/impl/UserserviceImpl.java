package com.mycomp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.Model.User;
import com.mycomp.dao.dataservice.IUserDataService;
import com.mycomp.service.IUserService;

@Service
public class UserserviceImpl implements IUserService {
	
	@Autowired
	private IUserDataService userDataService;

	@Override
	public List<User> getAllUsers() {
		return userDataService.getAllUsers();
	}

	@Override
	public String addUser(User user) {
		return userDataService.addUser(user);
	}

	@Override
	public String deleteUser(int userId) {
		return userDataService.deleteUser(userId);
	}

	@Override
	public User getUsersById(int userId) {
		return userDataService.getUsersById(userId);
	}

	@Override
	public User getUsersByName(String userName) {
		return userDataService.getUsersById(userName);
	}

}
