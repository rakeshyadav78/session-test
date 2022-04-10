package com.session.test.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.session.test.dto.ResponseInfo;
import com.session.test.service.StudentService;

@RestController
@RequestMapping(value = "/api/v1/student/")
public class StudentRestcontroller {
	private static final Logger logger=LoggerFactory.getLogger(StudentRestcontroller.class);
	
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping(value = "getAllStudents",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<ResponseInfo> getAllStudents(){
		ResponseInfo responseInfo=studentService.getAllStudent();
		return ResponseEntity.status(HttpStatus.OK).body(responseInfo);
	} 
	

}
