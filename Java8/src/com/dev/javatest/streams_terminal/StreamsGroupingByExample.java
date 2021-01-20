package com.dev.javatest.streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsGroupingByExample {

	public static Map<String, List<Student>> groupStudentsByGender() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		return studentMap;
	}

	public static Map<String, List<Student>> customizedGroupingBy() {
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
		return studentMap;
	}

	// two level grouping {Function, HashMap::new (default),downstream }

	public static void twoLevelGrouping_1() {
		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
		System.out.println(studentMap);

	}

	public static void twoLevelGrouping_2() {
		Map<String, Integer> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
		System.out.println(studentMap);

	}

	// {Function, Our own type of Map, Downstream}
	public static void threeArgumentsGroupBy() {
		LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
		System.out.println(studentLinkedHashMap);
	}

	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(studentMapOptional);

		Map<Integer, Student> studentMap1 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors
						.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		System.out.println(studentMap1);
	}
	
	public static void calculateLeastGpa() {
		Map<Integer, Optional<Student>> studentMapOptional = StudentDataBase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));
		System.out.println(studentMapOptional);

		Map<Integer, Student> studentMap1 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors
						.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		System.out.println(studentMap1);
	}

	public static void main(String[] args) {

		System.out.println("Grouping by Gender : " + groupStudentsByGender());

		System.out.println("customized Grouping by GPA : " + customizedGroupingBy());

		twoLevelGrouping_1();

		twoLevelGrouping_2();

		threeArgumentsGroupBy();

		calculateTopGpa();
		
		calculateLeastGpa();

	}

}
