package com.Lawtendo.Application;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/")
public class LoginController {

	@Autowired
	UserService userService;
	
	public LoginController() {
		System.out.println("Login Controller");
	}
	
	@GetMapping("/login")
	public Map<String, String> login() {
		System.out.println("GET /login");
		Map <String, String> map = new HashMap<>();
		map.put("status", "200");
		return map;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public Map<String, String> login(@RequestBody User user) {
		Map <String, String> map = new HashMap<>();
		map.put("email", user.getEmail());
		map.put("password", user.getPassword());
		map.put("status", "200");
		return map;
	}
	
	

}
