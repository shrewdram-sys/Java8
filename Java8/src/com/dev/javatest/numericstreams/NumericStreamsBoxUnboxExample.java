package com.dev.javatest.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxUnboxExample {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10) // IntStream of 10 elements
				// int
				.boxed() // integer
				.collect(Collectors.toList());
	}

	public static int unBoxing(List<Integer> integerList) {
		// wrapper to primitive
		return integerList.stream()
				.mapToInt(Integer::intValue)
				.sum();
	}

	public static void main(String[] args) {
		System.out.println("Boxing" + boxing());
		
		List<Integer> integerList = boxing();
		System.out.println("UnBoxing :" + unBoxing(integerList));

	}

}
