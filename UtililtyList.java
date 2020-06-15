package com.classEx;

import java.util.Iterator;
import java.util.List;

public class UtililtyList {

	public void printList(List<Employee> list) {

		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.println(employee.id + " " + employee.name + " "
					+ employee.salary);
		}

	}

}
