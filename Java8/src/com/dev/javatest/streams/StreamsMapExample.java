package com.dev.javatest.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsMapExample {

	public static List<String> namesList(){
		List<String> studentList =  StudentDataBase.getAllStudents()
				.stream().map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		return studentList;
	}
	
	public static void main(String[] args) {
		System.out.println(namesList());
	}

}
