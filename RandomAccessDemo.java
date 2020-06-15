package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) throws IOException {

		File dir = new File("MyDir");
		File f = new File(dir, "Test.txt");

		RandomAccessFile ra = new RandomAccessFile(
				"Z:\\CoreJava30thAug4to6pm\\FileIO(17thOct)\\MyDir\\Test.txt",
				"rw");

		// ra.seek(10);

		long pos = ra.getFilePointer();

		System.out.println("\n" + pos);

		int i = 0;
		while (i != -1) {
			i = ra.read();
			System.out.print((char) i);
		}

		// long pos1 = ra.getFilePointer();
		// System.out.println("\n" + pos1);
		
		String str = "Steve";
		
		ra.seek(20);
		
		byte ar[] = str.getBytes();
		
		ra.write(ar); // convert string to byte Array
		
		//ra.writeBytes(str); // directly implementing writeBytes method
		while (i != -1) {
			i = ra.read();
			System.out.print((char) i);
		}

		ra.close();

	}

}
