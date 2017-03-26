/**
 * 
 */
package com.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.models.User;
import com.springboot.services.UserService;

/**
 * Service End point for student related RESTful urls
 * 
 * @author psiva
 *
 */
@RestController
public class UserController implements ErrorController {
	private static final String PATH = "/error";

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "Application started running";
	}

	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> getStudentList() {
		List<User> userList = new ArrayList<>();
		userList = userService.doGetAllUsers();
		return new ResponseEntity<>(userList,HttpStatus.OK);
	}

	
	@GetMapping(value = "/user")
	public ResponseEntity<User> getStudent(@RequestParam(name="email",required=true) String email) {
		User user = null;
		user = userService.doGetUserByEmail( email);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = PATH)
	public String error() {
		return "Error handling";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}
