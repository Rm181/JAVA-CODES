package com.abstraction;

public abstract class Shape {
	
	String x;
	
	public Shape() {
		x = "Default";
	}
	
	public Shape(String x){
		this.x = x;
	}
	
	public void method1() {
		System.out.println("Method1 of Abstract class Shape");
	}
	
	public abstract double area();
	

}

4