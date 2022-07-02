package com.wipro.ShopForHome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@GetMapping(path="/welcome")
	public String welcome() {
		return "Welcome to ShopForHome";
	}


}


