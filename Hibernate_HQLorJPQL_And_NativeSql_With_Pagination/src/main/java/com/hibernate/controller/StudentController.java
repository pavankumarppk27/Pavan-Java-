package com.hibernate.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.Student;
import com.hibernate.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepo;

	@GetMapping("/saveStudentData")
	public String saveStudentData() {

		List<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student("Paul", "Economics", 78.9));
		stdList.add(new Student("Zevin", "Computer Science", 91.2));
		stdList.add(new Student("Harish", "History", 83.7));
		stdList.add(new Student("Xiano", "Literature", 71.5));
		stdList.add(new Student("Soumya", "Economics", 77.5));
		stdList.add(new Student("Asif", "Mathematics", 89.4));
		stdList.add(new Student("Nihira", "Computer Science", 84.6));
		stdList.add(new Student("Mitshu", "History", 73.5));
		stdList.add(new Student("Vijay", "Mathematics", 92.8));
		stdList.add(new Student("Harry", "History", 71.9));

		return studentRepo.findAll().isEmpty() ? studentRepo.saveAll(stdList).isEmpty() ? "not saved" : "saved"
				: "Already Records Are Available.";
	}

	@GetMapping("/findAllStudentsData")
	public List<Student> findAllStudentsData() {

		return studentRepo.findAllStudentsData();
	}

	@GetMapping("/findAllSpecificData")
	public List<Object[]> findAllSpecificData() {

		return studentRepo.findAllSpecificData();
	}

	@GetMapping("/findStudentsByName")
	public Student findStudentsByName() {

		return studentRepo.findStudentsByName("Paul");
	}

	@GetMapping("/findStudentsByRange")
	public List<Student> findStudentsByRange() {

		return studentRepo.findStudentsByRange(2, 6);
	}

	@GetMapping("/deleteByName")
	@Transactional
	public void deleteByName() {

		studentRepo.deleteByName("Paul");

	}

	@GetMapping("/findAllStudentsDataWithPagination")
	public List<Student> findAllStudentsDataWithPagination() {

		return studentRepo.findAllStudentsDataWithPagination(PageRequest.of(1, 5));
	}

	@GetMapping("/findAllStudentsDataWithPaginationWithSorting")
	public List<Student> findAllStudentsDataWithPaginationWithSorting() {

		return studentRepo.findAllStudentsDataWithPaginationWithSorting(PageRequest.of(1, 5,Direction.DESC,"id"));
	}
	
	//native queries
	@GetMapping("/findByAllStudents")
	public List<Student> findByAllStudents(){
		
		return studentRepo.findByAllStudents();
	}
	
	@GetMapping("/findByAllStudentsByName")
	public Student findByAllStudentsByName() {
		
		return studentRepo.findByAllStudentsByName("Soumya");
	}

}
