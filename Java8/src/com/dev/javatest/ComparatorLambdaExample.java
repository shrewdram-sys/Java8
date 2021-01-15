package com.dev.javatest;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
		
		Comparator<Integer> cmp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("result is " + cmp.compare(3, 4));
		
		Comparator<Integer> cmpLmbda = (a,b) -> a.compareTo(b);
		System.out.println(cmpLmbda.compare(10, 8));
	}

}
