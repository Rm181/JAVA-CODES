package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Steve");
		set.add("Tony");
		set.add("Banner");
		set.add("Clark");
		set.add("Bruce");
		set.add("Steve");
		set.add("Steve");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
