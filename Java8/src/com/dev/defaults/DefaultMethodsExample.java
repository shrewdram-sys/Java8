package com.dev.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Adam","Jenny", "Alex", "Dan", "Mike","Eric");
		//prior java8
		
	/*	Collections.sort(stringList);
		System.out.println("Sorted list using collection: " + stringList); */
		
		//Java8
		stringList.sort(Comparator.naturalOrder());
		
		System.out.println("Sorted list using List.sort() :"+ stringList );
		
		stringList.sort(Comparator.reverseOrder());
		
		System.out.println("Sorted list using List.sort() reverse :"+ stringList );
		
	}

}
