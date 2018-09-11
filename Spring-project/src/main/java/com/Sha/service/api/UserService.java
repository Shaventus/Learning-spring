package com.Sha.service.api;

import java.util.List;

import com.Sha.model.User;
import com.Sha.model.dto.UserDto;

public interface UserService {
	
	User createUser(UserDto userDto);
	
	User findbyId(Integer id);
	
	User findbyName(String name);
	
	List<User> findAll();
	
	User update(User user);

}
