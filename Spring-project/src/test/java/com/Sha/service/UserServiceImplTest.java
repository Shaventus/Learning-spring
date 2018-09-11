package com.Sha.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

	@Autowired
	private UserServiceImpl userService;
	
	@Test
	public void contextLoads() throws Exception {
		assertNotNull(userService);
	}
	
	@Test
	public void testFindbyId() {
		assertNotNull(userService.findbyId(1));
	}

	@Test
	public void testFindbyName() {
		assertNotNull(userService.findbyName("a"));
	}

	@Test
	public void testUpdate() {
		// TODO
	}

	@Test
	public void testFindAll() {
		assertNotNull(userService.findAll());
	}

}
