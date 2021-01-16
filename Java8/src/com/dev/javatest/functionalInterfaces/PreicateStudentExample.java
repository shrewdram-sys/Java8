package com.dev.javatest.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class PreicateStudentExample {

	static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	
	static Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

	public static void filterStudentByGradeLevel() {
		System.out.println("Grade level filter");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(s -> {
			if (p1.test(s)) {
				System.out.println(s);
			}
		});
	}
	
	public static void filterStudentByGpa() {
		System.out.println("GPA filter");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(s -> {
			if (p2.test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void filterStudents() {
		System.out.println("Students filter");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(s -> {
			if (p1.and(p2).negate().test(s)) {
				System.out.println(s);
			}
		});
	}

	public static void main(String[] args) {
		filterStudentByGradeLevel();
		filterStudentByGpa();
		filterStudents();
	}
}
