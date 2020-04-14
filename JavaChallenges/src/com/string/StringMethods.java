package com.string; 

import java.lang.reflect.Method;

public class StringMethods {

	public static void main(String[] args) throws ClassNotFoundException {


		Class clazz = Class.forName("java.lang.Object");
		
		Method[] declaredMethods = clazz.getDeclaredMethods();
		
		for(Method method:declaredMethods) {
			
			System.out.println(method.getName());
			
		}
		
	
		
	}

}
