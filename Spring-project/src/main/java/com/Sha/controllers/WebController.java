package com.Sha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Sha.service.api.UserService;

@Controller
public class WebController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/userlist")
	public String userList(Model model) {
		model.addAttribute("list", userService.findAll());
		return "userlist";
	}

}
