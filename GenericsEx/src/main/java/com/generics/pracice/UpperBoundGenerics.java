package com.generics.pracice;

import java.util.Arrays;
import java.util.List;

public class UpperBoundGenerics {
	
	//? extend Number
	
	public static void main(String[] args) {
		
		
		List<Integer> listInt=Arrays.asList(10,20,30,40,50);			
		System.out.println(getSum(listInt));
		
		List<Long> listLong=Arrays.asList(11l,22l,44l);		
		System.out.println(getSum(listLong));
		
	}
//method with upperbound wildcard -->if not mentions (? extends) we will get C.E
	public static <T> int getSum(List<? extends Number> list) {
		
		 int sum=0;
		for(Number num:list)
		{
			sum +=num.intValue();
		}
		return sum;		
	}
	
	
}
