package com.ecobazaar.ecobazaar.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
	
	@NotBlank(message="Email is Recquired")
	@Email(message="Enter a Valid Email")
	private String email;
	
	//commit
	@NotBlank(message="Password is Recquired")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
