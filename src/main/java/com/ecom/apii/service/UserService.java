package com.ecom.apii.service;

import java.util.List;

import com.ecom.apii.exception.UserException;
import com.ecom.apii.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
