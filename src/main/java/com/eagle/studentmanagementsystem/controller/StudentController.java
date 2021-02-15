package com.eagle.studentmanagementsystem.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.eagle.studentmanagementsystem.model.Student;
import com.eagle.studentmanagementsystem.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
	public Optional<Student> getStudent(@PathVariable int studentId) {
		return studentService.getStudent(studentId);
	}
	
	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.DELETE) 
	public void deleteStudent(@PathVariable int studentId) {
		studentService.delete(studentId);
	}
	
	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student, @PathVariable int studentId) {
		student.setId(studentId);
		studentService.updateStudent(student);
	}

}
