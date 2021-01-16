package com.dev.javatest.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
	static Consumer<Student> c2 = student -> System.out.println(student);
	static Consumer<Student> c3 = student -> System.out.print(student.getName());
	static Consumer<Student> c4 = student -> System.out.println(student.getActivities());
	
	public static void main(String[] args) {
		
		c1.accept("ramkumar");
		printStudents();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
	}
	
	static void printStudents() { 
		
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c2);
	}
	
	static void printNameAndActivities() { 
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(c3.andThen(c4));
	}
	
	static void printNameAndActivitiesUsingCondition() { 
		System.out.println("printNameAndActivitiesUsingCondition");
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(student ->{
			if(student.getGradeLevel() >=3 && student.getGpa()>=3.9) {
				c3.andThen(c4).accept(student);
			}
		});
	}
}
