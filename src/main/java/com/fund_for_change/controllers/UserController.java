package com.fund_for_change.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fund_for_change.domain.User;
import com.fund_for_change.dto.UserDTO;
import com.fund_for_change.services.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	// Insert user
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {

		try {
			return new ResponseEntity<>(this.service.saveUser(userDTO), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// get all users
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = service.getUsers();
		if (users.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.of(Optional.of(users));
		}

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> findUserById(@PathVariable("id") String id) {
		try {
			User user = service.getUserById(id);
			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable("id") String id) {
		try {
			User user = service.getUserById(id);
			service.deleteUser(user);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update-usr")
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		try {
			
			return new ResponseEntity<>(service.updateUser(user), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
