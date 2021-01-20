package com.dev.javatest.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIteratorExample {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("adam", "dan", "julie");
		stringStream.forEach(System.out::println);

		Stream.iterate(1, x -> x * 2)
		.limit(10)
		.forEach(System.out::println);

		
		Supplier<Integer> intSupplier = new Random()::nextInt;
		Stream.generate(intSupplier)
		.limit(5)
		.forEach(System.out::println);
	}

}
