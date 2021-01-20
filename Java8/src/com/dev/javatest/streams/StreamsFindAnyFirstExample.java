package com.dev.javatest.streams;

import java.util.Optional;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findFirst();
	}

	public static void main(String[] args) {
		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if(studentOptionalFindAny.isPresent()) {
			System.out.println("find Any" + studentOptionalFindAny.get());
		}
		
		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if(studentOptionalFindFirst.isPresent()) {
			System.out.println("find First" + studentOptionalFindFirst.get());
		}
	}

}
