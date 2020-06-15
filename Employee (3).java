package com.collections;

import com.sun.org.apache.regexp.internal.recompile;

public class Employee implements Comparable<Employee> {

	public int empid;
	public String empname;
	public double salary;

	public Employee() {
		empid = 101;
		empname = "Laxman";
		salary = 12500;
	}

	public Employee(int empid, String empname, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e) {
		// if (e.empid < this.empid)
		// return 1;
		// else if (e.empid > this.empid)
		// return -1;
		// else
		// return 0;

		// return this.empname.compareTo(e.empname);

		if (e.salary < this.salary)
			return 1;
		else if (e.salary > this.salary)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return empid + " " + empname + " " + salary;
	}

}
