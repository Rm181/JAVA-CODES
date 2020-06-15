package com.inherit;

public class Manager extends Employee {

	int ptallow, fdallow, incentive;

	public Manager() {
	//super(10, "Laxman", 5000);
		System.out.println("Default const of Manager class");
		ptallow = 100;
		fdallow = 500;
	}

	public Manager(int empid, String empname, double salary, int ptallow,
			int fdallow, int incentive) {
	//super(empid, empname, salary);
		System.out.println("Parameterized constructor of Manager class");
		this.fdallow = fdallow;
		this.ptallow = ptallow;
		this.incentive = incentive;

	}

	@Override
	public String toString() {
		return empid + " " + empname + " " + salary + " " + ptallow + " "
				+ fdallow + " " + incentive;
	}

	public double calIncentive() {
		return 0.1 * salary;   //salary from employee
	}

//	@Override
//	public double calSalary() {
//		// TODO Auto-generated method stub
//		return super.calSalary() + ptallow + fdallow;
//	}

}
