package com.dev.javatest.streams_terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {

		List<String> namesList = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println("namesList: "+namesList);
		
		Set<String> namesSet = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println("namesSet: "+namesSet);
		
		List<String> usingMap = StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.toList());
		System.out.println("usingMap: "+usingMap);
	}

}
