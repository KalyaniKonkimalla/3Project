package com.exam.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.Exception.UserNotFoundException;
import com.exam.Model.User;

public interface UserService {

	public ResponseEntity<List<User>> getUsers();
	
	public String registerUser(@Valid User user);
	
	public String loginUser(@Valid User user);
	
	public ResponseEntity<User> getUserById(Long userId) throws UserNotFoundException;
	
	public ResponseEntity<User> updateUserById(Long userId, User user) throws UserNotFoundException;
	
	public ResponseEntity<User> deleteUserById(Long userId) throws UserNotFoundException;

}
