package com.abstraction;

public class Rectangle extends Shape {

	String shape;
	int len, br;

	public Rectangle(String shape, int len, int br) {
		super(shape);
		this.len = len;
		this.br = br;
	}

	@Override
	public double area() {
		return (double) len * br;
	}

}
