package com.generics.pracice;

public class GenericMethod<T> {

	private T[] arr;

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}
	
	
	

	public GenericMethod(T[] arr) {
		
		this.arr = arr;
	}

	//non static generic method
	//here it accepts any type of Integer or Long or Employee any type
	public <E> void getElements(E[] arr) {
		
	}
	
	
@SuppressWarnings("hiding")
public <T> void getElements2(T[] arr) {
		
	}
	
}
