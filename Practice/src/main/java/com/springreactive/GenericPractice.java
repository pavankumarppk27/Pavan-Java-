package com.springreactive;

import java.util.Arrays;
import java.util.List;

public class GenericPractice {

	public static void main(String[] args) {

		GenericPractice gp=new GenericPractice();

		Integer[] intValues = { 1, 2, 3, 4, 5, 6 };
	
		//intVal.setArr(intValues);

		gp.getElements(Arrays.asList(intValues));
		

		String[] strValues= {"A","B","C","D"};
		
		gp.getElements(Arrays.asList(strValues));
		
		gp.getElements(Arrays.asList(new PracticeApplication()));
		
		
	}
	
	public <E> void getElements(List<E> arr) {

		for(E e:arr) {
			System.out.println("==========:"+e);
		}
		
	}

}
