package com.generics.pracice;

import java.util.Arrays;
import java.util.List;

public class UnboundedGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> intList = Arrays.asList(10,20,30);
		List<String> strList=Arrays.asList("pavan","kumar","ppk");
		getValues(intList);
		getValues(strList);
		
		
	}
	//we can use lower or upper bounds not both
	public static void getValues(List<?> values) {
		
		for (Object object : values) {
			
			System.out.println(object);
		}
		
	}
	

}
