package com.files;

import java.io.File;
import java.io.IOException;

public class FileUtility {

	public static void main(String[] args) throws IOException {

		File f = new File("MyDir");

		if (!f.exists()) {
			System.out.println(f.mkdir());
		} else {

			File MyText = new File(f, "Test.txt");

			if (!MyText.exists()) {
				System.out.println(MyText.createNewFile());
			} else {
				System.out.println(MyText.delete());
			}

		}

	}

}
