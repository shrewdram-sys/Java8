package com.dev.optional;

import java.util.Optional;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class OptionalExample {

	public static String getStudentName() {
		Student student = StudentDataBase.studentSupplier.get();
		if (student != null) {
			return student.getName();
		}
		return null;
	}

	public static Optional<String> getStudentNameOptional() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

//		Optional<Student> studentOptional = Optional.ofNullable(null);
		if (studentOptional.isPresent()) {
			return studentOptional.map(Student::getName); // Optional<String>
		}
		return Optional.empty(); // Represents an optional object with no values
	}

	public static void main(String[] args) {
		String name = getStudentName();
		System.out.println("Length of the name is :" + name.length());

		Optional<String> stringOptional = getStudentNameOptional();
		if (stringOptional.isPresent()) {
			System.out.println("Length of the name by optional is :" + stringOptional.get().length()); // String which
																										// is student
																										// name
		}

	}

}
