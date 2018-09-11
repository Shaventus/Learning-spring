package com.Sha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sha.model.User;
import com.Sha.model.dto.UserDto;
import com.Sha.repository.UserRepository;
import com.Sha.service.api.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(UserDto userDto) {
		User user = new User();
		user.setLogin(userDto.getLogin());
		user.setName(userDto.getName());
		user.setSurname(userDto.getSurname());
		user.setPassword(userDto.getPassword());
		
		userRepository.save(user);
		return user;
	}

	@Override
	public User findbyId(Integer id) {
		return userRepository.findById(id).get();
	}

	@Override
	public User findbyName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public User update(User user) {
		// TODO Update
		return null;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
