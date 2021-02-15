package com.eagle.studentmanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.eagle.studentmanagementsystem.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	

}
