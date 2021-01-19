package com.dev.javatest;

import java.util.function.Consumer;

public class LambdaVariable2 {

	static int i = 4;

	public static void main(String[] args) {

		Consumer<Integer> c1 = k -> {
			i++;
			System.out.println(k + i);
		};
		c1.accept(10);
	}

}
