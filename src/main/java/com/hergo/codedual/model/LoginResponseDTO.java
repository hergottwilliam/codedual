package com.hergo.codedual.model;

import com.hergo.codedual.model.ApplicationUser;

public class LoginResponseDTO {
	private ApplicationUser user;
	private String jwt;
	
	
	public LoginResponseDTO(ApplicationUser user, String jwt) {
		super();
		this.user = user;
		this.jwt = jwt;
	}
	
	public LoginResponseDTO() {
		super();
		
	}

	public ApplicationUser getUser() {
		return user;
	}

	public void setUser(ApplicationUser user) {
		this.user = user;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	
	
}
