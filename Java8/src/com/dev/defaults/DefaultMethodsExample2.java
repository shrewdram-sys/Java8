package com.dev.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class DefaultMethodsExample2 {
	
	static Consumer<Student> studentConsumer = student -> System.out.println(student);

	static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
	
	static Comparator<Student> gradeComparator = Comparator.comparingDouble(Student::getGpa);
	
	public static void sortByName(List<Student> studentList) {
		System.out.println("after sort");
		studentList.sort(nameComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void sortByGpa(List<Student> studentList) {
		System.out.println("after sort by GPA");
		studentList.sort(gradeComparator);
		studentList.forEach(studentConsumer);
	}
	
	public static void comparatorChaining(List<Student> studentList) {
		System.out.println("After comparator chaining");
		
		studentList.sort(gradeComparator.thenComparing(nameComparator));
		studentList.forEach(studentConsumer);
	}
	
	public static void sortwithNullValues(List<Student> studentList) {
		Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
		studentList.sort(studentComparator);
		studentList.forEach(studentConsumer);
	}

	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println("before sort");
		studentList.forEach(studentConsumer);
		
		sortByName(studentList);
		
		sortByGpa(studentList);
		
		comparatorChaining(studentList);
		
		// sortwithNullValues(studentList);
	}

}
