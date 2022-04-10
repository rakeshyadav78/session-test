package com.session.test.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.session.test.dto.ResponseInfo;
import com.session.test.dto.UserLogin;
import com.session.test.entity.Students;
import com.session.test.service.StudentService;

@Controller
@RequestMapping(value = "/student/")
public class StudentController {
	private static final Logger logger=LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping(value = "registerStudent")
	public @ResponseBody ResponseInfo registerStudent(
			@RequestParam String fName,
			@RequestParam String lName,
			@RequestParam String gender,
			@RequestParam String userName,
			@RequestParam String password) {
		ResponseInfo responseInfo=new ResponseInfo();
		logger.info("Fname ["+fName+"],Last Name ["+lName+"],Gender ["+gender+"],User Name ["+userName+"],Password ["+password+"]");
		Students students=new Students();
		students.setFirstName(fName);
		students.setLastName(lName);
		students.setGender(gender);
		students.setUserName(userName);
		students.setPassword(password);
		students.setRegDate();
		responseInfo=studentService.registerStudent(students);
		return responseInfo;
	}
	
	@PostMapping(value = "registerStudentJson")
	public @ResponseBody ResponseInfo registerStudentJson(@RequestBody Students students) {
		ResponseInfo responseInfo=new ResponseInfo();
		logger.info("Request ["+new Gson().toJson(students)+"]");
		students.setRegDate();
		responseInfo=studentService.registerStudent(students);
		logger.info("Response ["+new Gson().toJson(responseInfo)+"]");
		return responseInfo;
	}

	
	@RequestMapping(value = "studentLogin",method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView studentLogin(@ModelAttribute("userLogin") UserLogin userLogin,HttpServletRequest req,HttpServletResponse resp) {
		String ipaddress=req.getRemoteAddr();
		HttpSession session=req.getSession(false);
		String msg="";
		logger.info("User Login Request ["+new Gson().toJson(userLogin)+"],Ip Address ["+ipaddress+"]");
		ModelAndView modelAndView=new ModelAndView();
		Students students=new Students();
			students = studentService.getStudentByUserName(userLogin.getUserName());
			String sessionIpAddress=(String) session.getAttribute("ipaddress");
			logger.info("Student Info [" + new Gson().toJson(students) + "], Session Ip Address ["+sessionIpAddress+"]");
			if (students != null) {
				if (Objects.equals(userLogin.getPassword(), students.getPassword())) {
					session.setAttribute("studentInfo", students);
					modelAndView.setViewName("DashBoard");
				}else {
					msg="Invalid Username or password";
					session.invalidate();
					modelAndView.addObject("message", msg);
					modelAndView.setViewName("Login");
				}
			}else {
				msg="Invalid Username or password";
				session.invalidate();
				modelAndView.addObject("message", msg);
				modelAndView.setViewName("Login");
				
			}
		 return modelAndView;
	}
}
