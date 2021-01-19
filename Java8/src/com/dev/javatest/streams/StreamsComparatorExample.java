package com.dev.javatest.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

	}
	
	public static List<Student> sortStudentsByGpa() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentsByGpaDesc() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("Student sorted by name");
		sortStudentsByName().forEach(System.out::println);
		
		System.out.println("Student sorted by gpa");
		sortStudentsByGpa().forEach(System.out::println);
		
		System.out.println("Student sorted by gpa in Desc order");
		sortStudentsByGpaDesc().forEach(System.out::println);
		
	}
}
