package com.dev.javatest.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class ParallelStreamExample1 {

	public static List<String> sequentialPrintStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents()
				.stream() // stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();	
		System.out.println("Duration to execute in sequential :" + (endTime-startTime));
		return studentActivities;
	}
	
	public static List<String> parallelPrintStudentActivities() {
		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents()
				.stream() // stream<Student>
				.parallel()
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		long endTime = System.currentTimeMillis();	
		System.out.println("Duration to execute in Parallel :" + (endTime-startTime));
		return studentActivities;
	}
	
	public static void main(String[] args) {

		sequentialPrintStudentActivities();
		
		parallelPrintStudentActivities();
	}

}
