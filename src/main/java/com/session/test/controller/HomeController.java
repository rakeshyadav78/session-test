package com.session.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.session.test.dto.UserLogin;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req,HttpServletResponse res) {
		return "login";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(HttpServletRequest req,HttpServletResponse res) {
		return "signup";
	}
	
//	
//	@GetMapping(value = "/index")
//	public String studentLoginPage(Model model) {
//		model.addAttribute("userLogin", new UserLogin());
//		return "Login";
//	}
//	
}
