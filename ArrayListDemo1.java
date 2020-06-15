package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

import com.generics.Employee;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Tony", 1235));
		list.add(new Employee(2, "Steve", 2154));
		list.add(new Employee(3, "Banner", 2112345));
		list.add(new Employee(4, "Groot", 12545));

		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {

			Employee e = itr.next();
			System.out.println(e.empid + " " + e.empname + " " + e.salary);
		}

	}

}
