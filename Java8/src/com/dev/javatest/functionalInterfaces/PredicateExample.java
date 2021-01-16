package com.dev.javatest.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = i -> i%2==0;
	
	static Predicate<Integer> p2 = i -> i >= 10;
	
	public static void predicateAnd() {
		System.out.println("predicate AND is " + p1.and(p2).test(8));
		System.out.println("predicate AND is " + p1.and(p2).test(12));
	}
	
	public static void predicateOR() {
		System.out.println("predicate AND is " + p1.or(p2).test(7));
		System.out.println("predicate AND is " + p1.or(p2).test(12));
	}
	
	public static void predicateNegate() {
		System.out.println("predicate AND is " + p1.negate().test(12));
	}
	
	public static void main(String[] args) {
	
		System.out.println(p1.test(9));
		
		predicateAnd();
		predicateOR();
		predicateNegate();
	}

}
