package com.dev.optional;

import java.util.Optional;

import com.dev.javatest.functionalInterfaces.data.Bike;
import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class OptionalMapFlatMapExample {
	// filter
	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		studentOptional.filter(student -> student.getGpa() >= 3.5).ifPresent(student -> System.out.println(student));
	}

	// map
	public static void optionalMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		if (studentOptional.isPresent()) {
			Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.5)
					.map(Student::getName);
			System.out.println(stringOptional.get());
		}
	}

	// flatmap
	public static void optionalFlatMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<String> name = studentOptional
		.filter(student -> student.getGpa() >= 3.5)  //Optional<Student <Optional<Bike>>
		.flatMap(Student::getBike) //returns -> Optional<Bike>
		.map(Bike::getName);
		
		name.ifPresent(s-> System.out.println("name :"+s));
	}

	public static void main(String[] args) {
		optionalFilter();
		optionalMap();
		optionalFlatMap();
	}

}
