/**
 * 
 */
package com.springboot.dao;

import java.util.List;

import com.springboot.models.User;

/**
 * @author psiva
 *
 */
public interface UserDAO {

	public List<User> getAllUsers();

	public User getUserByEmail(String email);
}
