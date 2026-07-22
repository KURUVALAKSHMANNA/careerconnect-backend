package com.lakshmanna.careerconnect.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.lakshmanna.careerconnect.dto.UserRequest;
import com.lakshmanna.careerconnect.dto.UserResponse;
import com.lakshmanna.careerconnect.entity.User;
import com.lakshmanna.careerconnect.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
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
		user.setPassword(request.getPassword());
		user.setPhoneNumber(request.getPhoneNumber());
		
		user.setRole("USER");
		user.setCreatedAt(LocalDateTime.now());
		
		userRepository.save(user);
		
		return new UserResponse("User Registration Successful");
	}

}
