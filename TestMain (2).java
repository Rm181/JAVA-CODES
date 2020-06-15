package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Ram", 1235));
		list.add(new Employee(32, "Ajay", 12543));
		list.add(new Employee(38, "Chinmay", 2424));
		list.add(new Employee(125, "Dinesh", 12424));
		list.add(new Employee(898, "Xavier", 885635));
		list.add(new Employee(78, "Brijesh", 5666));

		//Collections.sort(list);
		//Collections.sort(list, new SortByID());
		Collections.sort(list, new SortByName());

		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
