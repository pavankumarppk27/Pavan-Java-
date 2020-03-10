package com.generics.pracice;

public class GenericClassImpl3<E,V> implements GenericInterface<E> {

	
	//rule3: we can specify like above from implementing interface
	
	private E key;
	private V value;
	
	@Override
	public void setValue(E e) {
		// TODO Auto-generated method stub
		this.key=e;
	}

	@Override
	public E getValue() {
		// TODO Auto-generated method stub
		return key;
	}

}
