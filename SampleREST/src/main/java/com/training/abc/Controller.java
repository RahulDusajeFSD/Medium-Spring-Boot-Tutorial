package com.training.abc;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	
	@Autowired
	StudentRepository repo;
	
	@PostMapping("/createStudent")
	public void createStudent(@RequestBody Student student)
	{
		repo.save(student);
	}
	
	@GetMapping("/getAllStudents")
	public Iterable<Student> getAllStudents()
	{
		return repo.findAll();
	}
	

}
