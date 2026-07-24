package com.lakshmanna.careerconnect.service;

import java.time.LocalDateTime;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.lakshmanna.careerconnect.dto.LoginRequest;
import com.lakshmanna.careerconnect.dto.LoginResponse;
import com.lakshmanna.careerconnect.dto.UserRequest;
import com.lakshmanna.careerconnect.dto.UserResponse;
import com.lakshmanna.careerconnect.entity.User;
import com.lakshmanna.careerconnect.repository.UserRepository;


@Service
public class UserService {

	private final BCryptPasswordEncoder passwordEncoder;
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}
	
//	=====================
//	Register User
//	=====================
	public UserResponse registerUser(UserRequest request) {
		
		if(userRepository.existsByEmail(request.getEmail()) ) {
			return new UserResponse("Eamil already exists...");
		}
		
		if(userRepository.existsByPhoneNumber(request.getPhoneNumber())) {
			return new UserResponse("Phone Number already exists...");
		}
		User user = new User();
		
		user.setFirstName(request.getFirstName());
		user.setLastName(request.getLastName());
		user.setEmail(request.getEmail());
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		user.setPhoneNumber(request.getPhoneNumber());
		
		user.setRole("USER");
		user.setCreatedAt(LocalDateTime.now());
		
		userRepository.save(user);
		
		return new UserResponse("User Registration Successful");
	}
	
	
//	==============
//	Login User
//	=============
	
	public LoginResponse loginUser(LoginRequest request) {
		User user = userRepository.findByEmail(request.getEmail())
				.orElseThrow(() -> new RuntimeException("Invalid Email"));
		
		if(!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			throw new RuntimeException("Invalid Password");
		}
		
		LoginResponse response = new LoginResponse();
		
		response.setMessage("Login Successful");
		response.setUserId(user.getId());
		response.setFirstName(user.getFirstName());
		response.setEmail(user.getEmail());
		response.setRole(user.getRole());
		
		return response;
	}
	
//	=================
//	Get User By ID
//	=================
	
	public LoginResponse getUserById(Long Id) {
		User user = userRepository.findById(Id)
				.orElseThrow(() -> new RuntimeException("User not found"));
		
		LoginResponse response = new LoginResponse();
		
		response.setMessage("User Found");
		response.setUserId(user.getId());
		response.setFirstName(user.getFirstName());
		response.setEmail(user.getEmail());
		response.setRole(user.getRole());
		
		return response;
	}
	
}
