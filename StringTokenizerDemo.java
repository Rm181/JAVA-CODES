package com.misc;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String str = "Good evening everyone, This demo is to demonstrate String tokenizer";
		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
