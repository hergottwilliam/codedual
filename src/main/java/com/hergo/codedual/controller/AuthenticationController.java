package com.hergo.codedual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hergo.codedual.model.ApplicationUser;
import com.hergo.codedual.model.LoginResponseDTO;
import com.hergo.codedual.model.RegistrationDTO;
import com.hergo.codedual.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;
	
	@PostMapping("/register")
	public ApplicationUser registerUser(@RequestBody RegistrationDTO body) {
		return authenticationService.registerUser(body.getUsername(), body.getPassword());
	}
	
	@PostMapping("/login")
	public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body) {
		return authenticationService.loginUser(body.getUsername(), body.getPassword());
	}
}
