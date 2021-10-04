package com.example.springdatajpatutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpatutorial.Entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student,Long> {
	
	

}