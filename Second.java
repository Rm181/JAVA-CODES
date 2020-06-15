package com.testException;

public class Second {

	public void secondMethod() {
		First f = new First();
		try {
			f.firstMethod();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Second Method of Second Class");

	}

}
