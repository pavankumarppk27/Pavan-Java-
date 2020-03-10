package com.generics.pracice;

public class GenericClassImpl<E> implements GenericInterface<E>{

	//Rule1:if suppose Interface is generic then Implementation class should be the Generic Class.
	
	private E e;
	
	
	@Override
	public void setValue(E e) {
		// TODO Auto-generated method stub
		this.e=e;
	}

	@Override
	public E getValue() {
		// TODO Auto-generated method stub
		return e;
	}

}
