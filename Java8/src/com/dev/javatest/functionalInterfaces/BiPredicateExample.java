package com.dev.javatest.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class BiPredicateExample {

	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

	BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
			.println(name + " : " + activities);

	Consumer<Student> studentConsumer = s -> {
		if (biPredicate.test(s.getGradeLevel(), s.getGpa())) {
			studentBiConsumer.accept(s.getName(), s.getActivities());
		}
	};

	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> list = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(list);

	}
}
