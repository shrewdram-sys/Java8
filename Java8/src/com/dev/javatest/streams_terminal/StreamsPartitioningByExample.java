package com.dev.javatest.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamsPartitioningByExample {

	public static void partitioningByExample() {
		Predicate<Student> gpaPredicate = s -> s.getGpa()>=3.8;
		Map<Boolean, List<Student>> partitioningMap =  StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.partitioningBy(gpaPredicate));
		
		System.out.println("partitioningMap :" + partitioningMap);
	}
	
	public static void partitioningByExample_2() {
		Predicate<Student> gpaPredicate = s -> s.getGpa()>=3.8;
		Map<Boolean, Set<Student>> partitioningMap_2 =  StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.partitioningBy(gpaPredicate,
				Collectors.toSet()));
		
		System.out.println("partitioningMap_2 :" + partitioningMap_2);
	}
	
	public static void main(String[] args) {
		partitioningByExample();
		
		partitioningByExample_2();
	}

}
