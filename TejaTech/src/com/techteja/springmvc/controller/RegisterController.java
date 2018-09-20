package com.techteja.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techteja.springmvc.dao.UserDao;

@Controller
public class RegisterController {
	@RequestMapping("/")
	public String firstScren(){
		return"login";
	}
}	