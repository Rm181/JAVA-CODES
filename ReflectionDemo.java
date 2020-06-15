package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;

import com.annot.Employee;

public class ReflectionDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("com.annot.Employee");
		System.out.println("Class Loaded...");
		
		Method m[] = c.getDeclaredMethods();
						
		for(Method x : m){
			System.out.println(x);
		}
		
		Field f[] = c.getDeclaredFields();
		
		for(Field x : f){
			System.out.println(x);
		}
		
		Constructor con[] = c.getConstructors();
		
		for(Constructor c1 : con){
			System.out.println(c1);
		}
		
		
		
	}

}
