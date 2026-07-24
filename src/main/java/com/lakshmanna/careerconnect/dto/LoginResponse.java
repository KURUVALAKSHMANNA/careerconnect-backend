package com.lakshmanna.careerconnect.dto;

public class LoginResponse {
	private String message;
	private Long userId;
	private String firstName;
	private String email;
	private String role;
	
	public LoginResponse() {
		
	}
	
//	public LoginResponse(String message) {
//		this.message = message;
//	}
	
//	public LoginResponse(String message, Long userId, String firstName, String email, String role) {
//		this.message = message;
//		this.userId = userId;
//		this.firstName = firstName;
//		this.email = email;
//		this.role = role;
//	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getFirstString() {
		return firstName;
	}
	
	public void setFirstName(String firstName) { 
		this.firstName = firstName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
}
