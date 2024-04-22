package com.ling.controller;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

	@PostMapping("/user")
	public String addUser(@Valid @RequestBody User user, BindingResult result) {
		System.out.println(user);
		return "success";
	}
}
