package com.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="main")
public class StudentController {
	
	@GetMapping(value="/get")
	public String getMessage() {
		return "Welcome to the college";
	}

}
