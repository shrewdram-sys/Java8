package com.dev.optional;

import java.util.Optional;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class OptionalOrElseExample {

	// orElse
	public static String optionalOrElse() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Optional<Student> nullValue = Optional.ofNullable(null); // return default
		return studentOptional.map(Student::getName).orElse("default");
	}
	
	// orElseGet
	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		// Optional<Student> nullValue = Optional.ofNullable(null); // return default
		return studentOptional.map(Student::getName).orElseGet(() -> "Default");
	}

	// orElseThrow
	public static String optionalOrElseThrow() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//		 Optional<Student> nullValue = Optional.ofNullable(null); // return default
		return studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data Available"));
	}

	
	public static void main(String[] args) {

		System.out.println("OrElse "+ optionalOrElse());
		
		System.out.println("OrElseGet "+ optionalOrElseGet());
		
		System.out.println("OrElseThrow "+ optionalOrElseThrow());
	}
}
