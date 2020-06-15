package com.classEx;

import java.util.Iterator;
import java.util.List;

public class UtilityReport {

	public void showReport(List<Employee> list) {

		Iterator<Employee> itr = list.iterator();

		while (itr.hasNext()) {
			Employee employee = (Employee) itr.next();
			System.out.println(employee.name + " " + employee.salary);
		}
	}
}
