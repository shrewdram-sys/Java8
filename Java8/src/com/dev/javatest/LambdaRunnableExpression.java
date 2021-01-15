package com.dev.javatest;

public class LambdaRunnableExpression {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("running");
			System.out.println("running - 1");
		};
		new Thread(r).start();
		
		new Thread(() -> System.out.println("running-3")).start();
	}
}
