package com.dev.javatest.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static int findMax(List<Integer> integersList) {
		return integersList.stream()
		.reduce(0, (x,y) -> x>y ? x : y);  //x variable holds the max value for each elements in iteration
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integersList) {
		return integersList.stream()
		.reduce((x,y) -> x>y ? x : y);  //x variable holds the max value for each elements in iteration
	}
	
	
	public static int findMin(List<Integer> integersList) {
		return integersList.stream()
		.reduce(0, (x,y) -> x<y ? x : y);  //output will be 0(arg0) always
	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> integersList) {
		return integersList.stream()
		.reduce((x,y) -> x<y ? x : y);  //x variable holds the min value for each elements in iteration
	}
	
	public static void main(String[] args) {
		List<Integer> integersList = Arrays.asList(6,7,8,9,10);
		
		List<Integer> emptyList = Arrays.asList();
		System.out.println("max value is " + findMax(integersList));
		
		System.out.println("max value is using optional " + findMaxValueOptional(integersList).get());
		Optional<Integer> value = findMaxValueOptional(emptyList);
		if(value.isPresent()) {
			System.out.println("max value with empty is " + value.get());
		}else {
			System.out.println("Empty value");
		}
		
		System.out.println("min value is " + findMin(integersList));
		System.out.println("min value is using optional " + findMinValueOptional(integersList).get());
	}

}
