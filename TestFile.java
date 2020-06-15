package com.testException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fin = new FileInputStream("MyFile.txt");
		
	}

}
