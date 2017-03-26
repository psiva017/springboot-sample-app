/**
 * 
 */
package com.springboot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDAO;
import com.springboot.models.User;
import com.springboot.services.UserService;

/**
 * @author psiva
 *
 */
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> doGetAllUsers() {
		List<User> list = userDAO.getAllUsers();
		return list;
	}
	
	@Override
	public User doGetUserByEmail(String email) {
		return userDAO.getUserByEmail(email);
	}

}
