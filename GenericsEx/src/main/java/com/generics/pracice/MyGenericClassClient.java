package com.generics.pracice;

import java.util.Arrays;
import java.util.List;

public class MyGenericClassClient {

	public static void main(String[] args) {

       MyGenericClass<Integer> inte=new  MyGenericClass<Integer>();		
       inte.setValue(10);
       System.out.println(inte.getValue());
     
       MyGenericClass<Integer> intArr=new  MyGenericClass<>();	
       Integer[] intValues = { 10, 2, 3, 4, 5, 6 };
       intArr.setArrVal(intValues);      
       System.out.println(intValues[0]);
       
       MyGenericClass<Integer> listVal=new  MyGenericClass<>();	
       List<Integer> asList = Arrays.asList(10,2,3,4,5,6);
       listVal.setListVal((asList));      
       System.out.println(listVal.getListVal().get(0));
       
       
       //here we can take any type like(Long,Char,Float....)
       MyGenericClass<Double> doub=new  MyGenericClass<>();		
       doub.setValue(10d);
       System.out.println(doub.getValue());
		
	}

}
