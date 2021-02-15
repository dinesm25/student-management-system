package com.eagle.studentmanagementsystem.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eagle.studentmanagementsystem.model.Student;
import com.eagle.studentmanagementsystem.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Optional<Student> getStudent(int studentId) {
		 return studentRepository.findById(studentId);
	}

	public void delete(int studentId) {
		studentRepository.deleteById(studentId);
	}

	public void updateStudent(Student student) {
		studentRepository.save(student);
		
	}
	

}
