package com.generics.pracice;

public class GenericBoundedType<T extends Number> {

	private T[] val;

	//always Generics deals with Object types.
	//here below T[] expects only Object type not primitive type.
	
	public GenericBoundedType(T[] values) {

		this.val = values;
	}

	public double getAvg() {

		double sum = 0;

		for (int i = 0; i < val.length; i++) {

			sum += val[i].doubleValue();// if T type doesn't extends Number here we will get C.E
		}

		return sum / val.length;
	}

}
