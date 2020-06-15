package com.testException;

public class First {

	public void firstMethod() {

		try {
			int res = 10 / 0;
			System.out.println(res);
		} 
		catch (Exception e) {
			throw new ArithmeticException("Divide of such kind not allowed..");
		}
		finally {
			System.out.println("Finally of Firstmethod");
		}
		System.out.println("First Method of First class");
	}
}
