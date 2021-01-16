package com.dev.javatest.functionalInterfaces.methodrefernce;

import java.util.function.Predicate;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 =  RefactorMethodReferenceExample::greaterThanGradeLevel;

	public static boolean greaterThanGradeLevel(Student s) {
		return s.getGradeLevel() >= 3;
	}
	 
	public static void main(String[] args) {
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
	}

}
