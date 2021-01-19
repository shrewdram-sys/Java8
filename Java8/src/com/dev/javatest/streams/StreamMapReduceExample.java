package com.dev.javatest.streams;

import java.util.Optional;

import com.dev.javatest.functionalInterfaces.data.Student;
import com.dev.javatest.functionalInterfaces.data.StudentDataBase;

public class StreamMapReduceExample {

	public static int getNoteBookCount() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.filter(student -> student.getGradeLevel()>=3)
				.filter(student -> student.getGender().equals("female"))
				.map(Student::getNoteBooks) //Stream<Integer>
				.reduce(0, Integer::sum);
//				.reduce(0, (a,b) -> a+b);
	}

	public static void main(String[] args) {
		System.out.println(getNoteBookCount());
	}

}
