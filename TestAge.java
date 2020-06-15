package com.app;

public class TestAge {

	int age;

	public TestAge(int age) {  //parameterized constructor
		this.age = age;
	}

	public void checkAge() throws InvalidAgeException {   //function checkage checks exception
		if (age < 18)                       //condition
			throw new InvalidAgeException("Under 18 not allowed"); //here what we want it to throw
	}

	public static void main(String[] args) {

		TestAge t = new TestAge(15);
		try {
			t.checkAge();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Checking done");

	}

}
