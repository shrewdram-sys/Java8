package com.dev.javatest.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class FunctionStudentExample {

	static Function<List<Student>, Map<String, Double>> studentFunction = students -> {

		Map<String, Double> studentGradeMap = new HashMap<>();
		students.forEach(student -> {
			if (PreicateStudentExample.p1.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGradeMap;
	};

	public static void main(String[] args) {
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
	}

}
