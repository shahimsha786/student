package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.beans.Student;

@RestController
@RequestMapping(value="main")
public class StudentController {
	
	@GetMapping(value="/get")
	public String getMessage() {
		return "Welcome to the college";
	}
	
	@GetMapping(value="/getstudent")
	public Student getStudent() {
		Student student=new Student();
		student.setName("shahimsha");
		student.setAge(30);
		return student;
	}

}
