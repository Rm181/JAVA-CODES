package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("ABC");
		q.add("PQR");
		q.add("XYZ");
		q.add("PBM");
		q.add("BNM");
		q.add("TAR");
		
		Iterator<String> itr = q.iterator();
		
		for(String x : q){
			System.out.println(x);
		}

	}

}
