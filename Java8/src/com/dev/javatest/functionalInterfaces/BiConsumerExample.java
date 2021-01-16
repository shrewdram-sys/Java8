package com.dev.javatest.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class BiConsumerExample {

	public static void nameAndActivities() {
		BiConsumer<String, List<String>> biConsumer1 = (name,activities) -> System.out.println(name+ ":" + activities);
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach((s ->biConsumer1.accept(s.getName(), s.getActivities())));
	}

	
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (a,b) -> {
			System.out.println(a +" ++ "+b);
		};

		biConsumer.accept("Java", "Springboot");
		
		BiConsumer<Integer, Integer> multiply = (a,b) -> {
			System.out.println("multiplication "+ (a*b));
		};
		
		BiConsumer<Integer, Integer> division = (a,b) -> {
			System.out.println("division "+ (a/b));
		};
		
		multiply.andThen(division).accept(10, 5);
		
		nameAndActivities();
	}
	

}
