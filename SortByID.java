package com.collections;

import java.util.Comparator;

public class SortByID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empid < o2.empid)
			return 1;
		else if (o1.empid > o2.empid)
			return -1;
		else
			return 0;
	}

}
