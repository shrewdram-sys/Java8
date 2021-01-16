package com.dev.javatest.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () ->{
			return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
		};
		
		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
		
		System.out.println(studentSupplier.get());
		System.out.println(listSupplier.get());
	}
}
