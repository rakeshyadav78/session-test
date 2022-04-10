package com.session.test.controller;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.session.test.dto.UserLogin;

@Controller

@RequestMapping(value = "/pageredirect/")
public class PageRedirectController {

	public static final Logger logger = LoggerFactory.getLogger(PageRedirectController.class);

	@GetMapping(value = "loadTopMenu")
	public String loadTopMenu(Model model, @RequestParam String pageName) {
		logger.info("Top Menu Page Name [" + pageName + "]");
		String page = "";
		if (Objects.equals(pageName, "login")) {
			return "Login";
		} else if (Objects.equals(pageName, "registration")) {
			return "Registration";
		} else if (Objects.equals(pageName, "contactus")) {
			return "/menu/contactus";
		} else if (Objects.equals(pageName, "home")) {
			return "/menu/home";
		} else if (Objects.equals(pageName, "aboutus")) {
			return "/menu/aboutus";
		}
		return page;
	}

	@GetMapping(value = "loadSideMenu")
	public String loadSideMenu(Model model, @RequestParam String pageName) {
		logger.info("Side Menu Page Name [" + pageName + "]");
		String page = "";
		if (Objects.equals(pageName, "userreg")) {
			return "userreg";
		} else if (Objects.equals(pageName, "regdetail")) {
			return "regdetail";
		}

		return page;
	}

}
