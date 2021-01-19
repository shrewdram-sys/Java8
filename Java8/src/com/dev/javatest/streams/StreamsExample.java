package com.dev.javatest.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGradeLevel() >= 3 && student.getGpa()>=3.9)
				.peek(student ->{
					System.out.println(student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(studentMap);
	}

}
