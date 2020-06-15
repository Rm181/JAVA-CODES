package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> d1 = new ArrayList<>();
		d1.add(25);
		d1.add(100);
		d1.add(10);
		d1.add(20);
		d1.add(30);
		d1.add(40);
		d1.add(10);
		d1.add(0,35);
		
		
		Iterator<Integer> itr = d1.iterator();
		
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
		for(Integer i : d1){
			System.out.println(i);
		}
		
		
	}

}
