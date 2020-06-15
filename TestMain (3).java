package com.generics;

public class TestMain {

	public static void main(String[] args) {

		GeneralClass gc = new GeneralClass(25);

		Integer i = (Integer) gc.getObj(); // Everytime downcasting

		System.out.println(i);

		GeneralClass gc1 = new GeneralClass("Hello Everyone");

		String str = (String) gc1.getObj();
		
		System.out.println(str);
		
		gc = gc1;
		
		String str1 = (String)gc.getObj();
		 
		System.out.println(str1);
		
		GeneralClass gc2 = new GeneralClass(25.325);
		

	}

}
