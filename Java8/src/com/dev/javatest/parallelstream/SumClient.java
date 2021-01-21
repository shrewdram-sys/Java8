package com.dev.javatest.parallelstream;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {
		Sum sum = new Sum();
		IntStream.range(1, 1000)
		//1,2,3...1000
		.parallel()
		.forEach(sum::performSum); //operating parallel
		
		System.out.println(sum.getTotal()); //each time different o/p
	}

}
