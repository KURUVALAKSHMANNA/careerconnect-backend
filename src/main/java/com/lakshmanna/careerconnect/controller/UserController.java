package com.lakshmanna.careerconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmanna.careerconnect.dto.UserRequest;
import com.lakshmanna.careerconnect.dto.UserResponse;
import com.lakshmanna.careerconnect.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserResponse> registerUser(
			@RequestBody UserRequest request) {
		
		UserResponse response = userService.registerUser(request);
		
		return ResponseEntity.ok(response);
	}

}
