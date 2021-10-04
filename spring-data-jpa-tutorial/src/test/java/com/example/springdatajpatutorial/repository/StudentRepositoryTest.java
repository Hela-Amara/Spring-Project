package com.example.springdatajpatutorial.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.springdatajpatutorial.Entity.Student;

@SpringBootTest
class StudentRepositoryTest {
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		Student student =Student.builder()
				         .emailId("shabir@gmail.com")
				         .firstName("shabir")
				         .lastName("Dawoodi")
				         .guardanName("Nikhil")
				         .guardanEmail("nikhil@gmail.com")
				         .guardanMobile("99999999")
				         .build();
		studentRepository.save(student);
		
		
		
	}
	

	

}
