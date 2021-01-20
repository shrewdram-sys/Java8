package com.dev.javatest.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integers) {
		return integers.stream().limit(3).reduce((a, b) -> a + b);
	}
	
	public static Optional<Integer> skip(List<Integer> integers) {
		return integers.stream().skip(2).reduce((a, b) -> a + b);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);
		Optional<Integer> limitValue = limit(list);
		if (limitValue.isPresent()) {
			System.out.println("Limit value is " + limitValue.get());
		}

		Optional<Integer> skipValue = skip(list);
		if (skipValue.isPresent()) {
			System.out.println("Skip value is " + skipValue.get());
		}
	}

}
