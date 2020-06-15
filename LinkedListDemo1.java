package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		list.add("Test6");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
