package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public Student saveinfo(Student s)
	{
		return sr.save(s);
	}
	public List<Student> showinfo()
	{
		return sr.findAll();
	}
	
	

}
