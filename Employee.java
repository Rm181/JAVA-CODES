package com.annot;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface MyAnnotation {
	int id() default 10;

	String name() default "Test";
}


@MyAnnotation(id=15,name="Release1.2")
public class Employee {

	static int count;
	int i1;
	int empid;
	String empname;
	@MyAnnotation
	double salary;

	@MyAnnotation
	public Employee() {

	}

	public Employee(String empname, double salary) {
		count++;
		this.empid = count;
		this.empname = empname;
		this.salary = salary;

	}

	@Deprecated
	public void display() {
		System.out.println(empid + " " + empname + " " + salary);
	}

	public static int EmpCount() {
		return count;
	}

	@MyAnnotation
	@Override
	public String toString() {
		return empid + "-" + empname + "-" + salary;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee e1 = new Employee("Pratik", 25000);
		//System.out.println(e1);
		Employee e2 = new Employee();
		System.out.println(e2);
	}

}