package com.fund_for_change.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fund_for_change.domain.User;
import com.fund_for_change.dto.UserDTO;

@Service
public interface UserService {
	public User saveUser(UserDTO userDto);

	public List<User> getUsers();
	
	public User getUserById(String id);

	public User updateUser(User user);

	public void deleteUser(User user);
}
