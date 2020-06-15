package com.classEx;

import java.util.Set;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;
	Set<String> skillsets;

	public Employee(int id, String name, double salary, Set<String> skillsets) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.skillsets = skillsets;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", skillsets=" + skillsets + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if (this.id > e.id) {
			return 1;
		} else if (this.id < e.id) {
			return -1;
		} else {
			return 0;
		}
	}

}
