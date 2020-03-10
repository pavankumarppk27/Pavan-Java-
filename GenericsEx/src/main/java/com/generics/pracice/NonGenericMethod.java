package com.generics.pracice;

public class NonGenericMethod {

	
	//we can create generic method for non-generic class
	public <E> void getElements(E[] arr) {

		for(E e:arr) {
			System.out.println("==========:"+e);
		}
		
	}

}
