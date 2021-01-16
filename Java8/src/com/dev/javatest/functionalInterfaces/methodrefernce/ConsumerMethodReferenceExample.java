package com.dev.javatest.functionalInterfaces.methodrefernce;

import java.util.function.Consumer;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> c1 = System.out::println;
	
	static Consumer<Student> c2 = Student::printListofActivities;
	
	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(c1);
		System.out.println("method reference");
		StudentDataBase.getAllStudents().forEach(c2);
	}

}
