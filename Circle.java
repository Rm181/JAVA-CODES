package com.abstraction;

public class Circle extends Shape {

	String shape;
	int radius;
	
	public Circle() {
		radius = 5;
	}

	public Circle(String shape, int radius) {
		super(shape);
		this.radius = radius;
	}

	@Override
	public double area() {
        
      return (double) 3.142 * radius * radius;

        
        
	}
    

}
