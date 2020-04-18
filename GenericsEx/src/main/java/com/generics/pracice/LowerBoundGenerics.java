package com.generics.pracice;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList=new ArrayList<>();
		
		addNumber(intList);
		
		List<Number> numberList=new ArrayList<>();
		addNumber(numberList);
		
		List<Object> objList=new ArrayList<>();
		addNumber(objList);

	}

	public static void addNumber(List<? super Integer> listVal) {
		
		for(int i=0;i<=10;i++) {
			listVal.add(i);
		}
		
		System.out.println(listVal);
	}
	
	
}
