package com.dev.javatest.functionalInterfaces.methodrefernce;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUppercaseLambda = s -> s.toUpperCase();
	
	static Function<String, String> toUppercaseMethodReference = String::toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println(toUppercaseLambda.apply("java 8"));
		
		System.out.println(toUppercaseMethodReference.apply("java 8"));
		

	}

}
