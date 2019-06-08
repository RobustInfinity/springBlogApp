package com.Lawtendo.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/")
public class SignUpController {
	
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/signup")
	public User signUp(@RequestBody User user) {
		
		User userObj = userService.create(user);
		return userObj;
		
	}

}
