package com.serializabledemo;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	transient double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

}
