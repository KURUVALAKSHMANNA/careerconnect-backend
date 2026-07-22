package com.lakshmanna.careerconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lakshmanna.careerconnect.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	boolean existsByEmail(String email);
	boolean existsByPhoneNumber(String phoneNumber);
}