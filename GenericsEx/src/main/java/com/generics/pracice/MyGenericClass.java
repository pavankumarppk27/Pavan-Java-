package com.generics.pracice;

import java.util.List;

public class MyGenericClass<T> {

	private T value;
	private T[] arrVal;
	private List<T> listVal;
	
	
	
	public T getValue() {
		return value;
	}
	public List<T> getListVal() {
		return listVal;
	}
	public void setListVal(List<T> listVal) {
		this.listVal = listVal;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public T[] getArrVal() {
		return arrVal;
	}
	public void setArrVal(T[] arrVal) {
		this.arrVal = arrVal;
	}
	
	
	

}
