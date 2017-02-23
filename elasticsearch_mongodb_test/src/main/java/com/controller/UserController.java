package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bean.User;
import com.service.impl.UserServiceImpl;

@RestController
@RequestMapping(value = "/es/")
public class UserController {
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/list")
	@ResponseBody
	public Iterable<User> list(String username,String title) {
	    //userService.save(new User("je_ge", 33));
	    return userService.findAll(username,title);
	}
}
