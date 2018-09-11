package com.Sha.model.dto;

import javax.validation.constraints.NotNull;

public class UserDto {
	
	@NotNull
	private String login;
	
	@NotNull
	private String name;
	
	@NotNull
	private String password;
	
	@NotNull
	private String surname;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
