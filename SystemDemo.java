package com.misc;

import java.util.Scanner;

public class SystemDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter name :");
		String name = sc.next();
		System.out.println("The name entered is " + name);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age entered is " + age);

	}

}
