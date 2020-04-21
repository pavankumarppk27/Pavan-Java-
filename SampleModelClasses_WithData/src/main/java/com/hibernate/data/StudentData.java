package com.hibernate.data;

import java.util.ArrayList;
import java.util.List;
import com.hibernate.model.Student;

public class StudentData {

	
	
	public List<Student> getStudentData(){
		

		List<Student> stdList = new ArrayList<Student>();

		stdList.add(new Student("Paul", 11, "Economics", 78.9));
		stdList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		stdList.add(new Student("Harish", 13, "History", 83.7));
		stdList.add(new Student("Xiano", 14, "Literature", 71.5));
		stdList.add(new Student("Soumya", 15, "Economics", 77.5));
		stdList.add(new Student("Asif", 16, "Mathematics", 89.4));
		stdList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		stdList.add(new Student("Mitshu", 18, "History", 73.5));
		stdList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		stdList.add(new Student("Harry", 20, "History", 71.9));

		return stdList;
	}
	
	
	
}
