package com.dev.javatest.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> getListofActivitiesSorted() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream() // stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream).distinct().sorted().collect(Collectors.toList());
		return studentActivities;
	}

	public static Long getListofActivitiesCount() {
		long count = StudentDataBase.getAllStudents().stream() // stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream).distinct().count();
		return count;
	}

	public static void main(String[] args) {
		System.out.println(getListofActivitiesSorted());
		System.out.println(getListofActivitiesCount());
	}

}
