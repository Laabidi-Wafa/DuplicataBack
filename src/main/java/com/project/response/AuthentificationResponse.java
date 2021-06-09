package com.project.response;


public class AuthentificationResponse {

	private String token;
	
	public AuthentificationResponse()
	{
		
	}

	public AuthentificationResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
