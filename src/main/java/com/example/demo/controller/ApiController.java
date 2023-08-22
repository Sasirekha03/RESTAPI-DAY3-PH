package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class ApiController {
	
	@Autowired
	StudentService sser;
	
	@PostMapping("addstud")
	public Student add(@RequestBody Student s)
	{
		return sser.saveinfo(s);
	}
	
	@GetMapping("showstud")
	public List<Student> show()
	{
		return sser.showinfo();
	}
	

}
