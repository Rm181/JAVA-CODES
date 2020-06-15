package com.inherit;

  public class Employee{

	int empid;
	String empname;
	double salary;

//	public Employee() {
//		System.out.println("Default constructor of Emp class");
//		empid = 1;
//		empname = "Ram";
//		salary = 10000;
//	}

	public Employee(int empid, String empname, double salary) {
		System.out.println("Parameterized constructor of Emp class");
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return empid + " " + empname + " " + salary;
	}

	public double calSalary() {
		return salary;
	}
	
	protected String showName(){
		return empname;
	}

}
