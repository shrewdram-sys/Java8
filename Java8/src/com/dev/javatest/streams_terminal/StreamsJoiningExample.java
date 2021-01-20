package com.dev.javatest.streams_terminal;

import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsJoiningExample {

	public static String joining_1() {
		return StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		return StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.joining("-"));
	}
	
	public static String joining_3() {
		return StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.joining("-", "(", ")"));
	}
	
	public static void main(String[] args) {

		System.out.println("Joining : " + joining_1());
		
		System.out.println("Joining 2 : " + joining_2());
		
		System.out.println("Joining 3 : " + joining_3());
	}

}
