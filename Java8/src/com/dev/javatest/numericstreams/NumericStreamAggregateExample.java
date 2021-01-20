package com.dev.javatest.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {
		int sum = IntStream.range(1, 50).sum();
		System.out.println("sum is :" + sum);
		
		OptionalInt max = IntStream.rangeClosed(1, 50).max();
		System.out.println("max value is:" + (max.isPresent()? max.getAsInt() : 0));

		OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
		System.out.println("min long value is:" + (optionalLong.isPresent()? optionalLong.getAsLong() : 0));
		
		 OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
		 System.out.println("avg double value is:" + (optionalDouble.isPresent()? optionalDouble.getAsDouble() : 0)); 
	}

}
