package com.itheima.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	
	//@Resource(name = "userService")
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void save() {
		this.userService.save();
		System.out.println("controller   save");
	}
}
