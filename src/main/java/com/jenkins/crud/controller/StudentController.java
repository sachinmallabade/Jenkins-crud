package com.jenkins.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.crud.entity.Student;
import com.jenkins.crud.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getStudent()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		Student student = studentRepository.findById(id).get();
		return student;
	}
	
	@PostMapping("/student/add")
	public Student addStudent(@RequestBody Student student)
	{
		
		return studentRepository.save(student);
	}

}
