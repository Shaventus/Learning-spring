package com.Sha.model.dto;

import javax.validation.constraints.NotNull;

import com.Sha.model.User;

public class ItemDto {
	
	@NotNull
	private String name;
	
	@NotNull
	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
