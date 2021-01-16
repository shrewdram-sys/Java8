package com.dev.javatest.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students,
			studentPredicate) -> {
		Map<String, Double> studentGradeMap = new HashMap<>();

		students.forEach(student -> {
			if (studentPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGradeMap;

	};

	public static void main(String[] args) {
		System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PreicateStudentExample.p2));
	}
}