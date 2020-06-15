package com.classEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) throws EmployeeRecordNotFound {

		Set<String> set = new HashSet<>();
		set.add("C");
		set.add("C++");
		set.add("Core Java");
		set.add("C# .net");
		set.add("Sql");
		set.add("Angular");

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Steve", 21313, set));
		list.add(new Employee(2, "Tony", 247582, set));
		list.add(new Employee(3, "Banner", 25425, set));
		list.add(new Employee(4, "Groot", 24542, set));
		list.add(new Employee(5, "Clark", 24243, set));
		list.add(new Employee(6, "Bruce", 3545, set));

		Iterator<Employee> itr = list.iterator();

		// SortUtil su = new SortUtil();
		// su.sortBySal(list);
		//
		// while (itr.hasNext()) {
		// Employee employee = (Employee) itr.next();
		// System.out.println(employee.name + " " + employee.salary);
		// }
		
		// SearchUtil su = new SearchUtil();
		// su.searchEmpInfo(9, list);
		
		
		UtililtyList ul = new UtililtyList();
		
		ul.printList(list);
		

	}

}
