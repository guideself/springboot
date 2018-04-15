package com.thinkdo.springboot.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkdo.springboot.user.bean.User;
import com.thinkdo.springboot.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
    @Autowired(required = false)
    protected HttpServletRequest request;

    @Autowired(required = false)
    protected HttpServletResponse response;
    
    @Autowired
	private UserService userService;
    
	
	@RequestMapping("/selectAllUser")
	public List<User> selectAllUser() {
		List<User> users = userService.findAll();
		return users;
	}
}
