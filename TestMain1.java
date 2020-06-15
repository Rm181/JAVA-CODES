package com.generics;

public class TestMain1 {

	public static void main(String[] args) {

		// GenericClass<Integer> g1 = new GenericClass<Integer>(25);
		// Integer i = g1.getObj();
		// System.out.println(i);
		//
		// GenericClass<String> g2 = new GenericClass<String>("Good Evening");
		// String str = g2.getObj();
		// System.out.println(str);

		// Multiple Type parameter

		// MultipleType<Integer, String> gc1 = new MultipleType<Integer,
		// String>(
		// 101, "Kartik");
		//
		// Integer key = gc1.getObj1();
		// String value = gc1.getObj2();
		//
		// System.out.println(key + " " + value);
		//
		// MultipleType<String, Integer> gc2 = new MultipleType<String,
		// Integer>(
		// "Parth", 201);
		//
		// String k1 = gc2.getObj1();
		//
		// GenericClass<Employee> ge = new GenericClass<Employee>(new
		// Employee(1,
		// "Banner", 15000));
		//
		// Employee e1 = ge.getObj();
		//
		// System.out.println(e1);

		// Bounded Type Parameter

		BoundedType<Employee> b1 = new BoundedType<Employee>(new Manager(101,
				"Natasha", 112121, 1000, 1000, 1000));
		
		Employee m1 = b1.getObj();
		System.out.println(m1);

	}

}










