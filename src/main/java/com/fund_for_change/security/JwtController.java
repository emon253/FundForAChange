package com.fund_for_change.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fund_for_change.security.model.JwtRequest;
import com.fund_for_change.security.model.JwtResponse;
import com.fund_for_change.services.UserServiceImpl;

@RestController
public class JwtController {

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private JwtUtil util;

	@Autowired
	private AuthenticationManager authenticationManager;

	@PostMapping("login")
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest request) {
		try {
			this.authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
		} catch (Exception e) {
			e.printStackTrace();
			throw new UsernameNotFoundException("Invalid User or Password");
		}

		// Authenticated area
		UserDetails userDetails = this.userService.loadUserByUsername(request.getUserName());
		String token = this.util.generateToken(userDetails);
		return ResponseEntity.ok(new JwtResponse("Login", token));

	}
}
