package com.dev.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> integerList) {
		return integerList.stream().reduce(1, (x, y) -> x * y);
	}
	

	public int getSize(List<Integer> integerList) {
		System.out.println("Inside Impl class");
		return integerList.size();
	}

}
