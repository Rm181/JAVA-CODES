package com.misc;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {

		System.out.println("Enter the username :\n");
		Console con = System.console();
		String name = con.readLine();
		System.out.println("Username is :" + name);
		System.out.println("Enter the password :\n");
		char pass[] = con.readPassword();
		System.out.println("Password : " + pass);

	}

}
