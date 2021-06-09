package com.project.request;

import java.util.Set;

import javax.validation.constraints.NotBlank;
import com.project.model.Utilisateur;


public class LoginRequest {
	@NotBlank
	private String email;

	@NotBlank
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
