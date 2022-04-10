package com.session.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.test.dto.ResponseInfo;
import com.session.test.entity.Students;
import com.session.test.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public ResponseInfo registerStudent(Students students) {
		ResponseInfo responseInfo = new ResponseInfo();
		Students student = studentRepository.save(students);
		if (student != null) {
			responseInfo.setResponseCode("0000");
			responseInfo.setResponseMessage("Success");
			responseInfo.setResponseObject(student);
		} else {
			responseInfo.setResponseCode("1000");
			responseInfo.setResponseMessage("Failed");
		}
		return responseInfo;
	}
	
	public ResponseInfo getAllStudent() {
		ResponseInfo responseInfo = new ResponseInfo();
		List<Students> students=studentRepository.findAll();
		if(students!=null) {
			responseInfo.setResponseCode("0000");
			responseInfo.setResponseMessage("Success");
			responseInfo.setResponseObject(students);
		}else {
			responseInfo.setResponseCode("1001");
			responseInfo.setResponseMessage("No Record Found");
		}
		return responseInfo;
	}
	
	public Students getStudentByUserName(String userName) {
		return studentRepository.findByuserName(userName).orElse(null);
		
	}
	
}
