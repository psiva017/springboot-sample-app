/**
 * 
 */
package com.springboot.services;

import java.util.List;

import com.springboot.models.User;

/**
 * @author psiva
 *
 */
public interface UserService {

	
	public List<User> doGetAllUsers();

	public User doGetUserByEmail(String email);
}
