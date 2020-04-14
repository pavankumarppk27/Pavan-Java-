package com.customcollections;

public class CustomArray<T> {

	private Object[] objArray = null;
	private Integer elementCount = 0;

	public CustomArray() {
		objArray = new Object[10];
	}

	public void add(Object value) {
		if (objArray.length == elementCount) {
			increaseCapacity();
		}
		objArray[elementCount] = value;
		elementCount++;

	}

	private void increaseCapacity() {

		Object[] newArray = new Object[elementCount * 2];

		for (int i = 0; i < objArray.length; i++) {
			newArray[i] = objArray[i];
		}
		this.objArray = newArray;
	}

	public int capacity() {

		return objArray.length;
	}

	public int size() {

		return elementCount;
	}

	public Object get(int index) {

		if (index < 0 || index >= elementCount) {
			throw new IndexOutOfBoundExceptions("IndexOutOfBoundExceptions with the index of " + index);
		}

		return objArray[index];
	}

	public void replace(int index, Object object) throws IndexOutOfBoundExceptions {

		if (index < 0 || index >= elementCount) {
			throw new IndexOutOfBoundExceptions("IndexOutOfBoundExceptions with the index of " + index);
		}
		objArray[index] = object;
	}

	public void remove(int index) {
		if (index < 0 || index >= elementCount) {
			throw new IndexOutOfBoundExceptions("IndexOutOfBoundExceptions with the index of " + index);
		}

		while (index < size() - 1) {

			objArray[index] = objArray[index + 1];
			index++;
		}
		objArray[index] = null;
		elementCount--;
	}

	public void insert(int index, Object object) {

		if (index < 0 || index >= elementCount) {
			throw new IndexOutOfBoundExceptions("IndexOutOfBoundExceptions with the index of " + index);
		}
		
		if(size()==capacity()) {
			increaseCapacity();
		}

		// elementCount++;
		int size = size();
		int indexVal = index - 1;
		while (size > indexVal) {

			objArray[size] = objArray[size - 1];
			indexVal++;
			size--;

		}

		objArray[index] = object;

	}

	public void insertVal(int index, Object object) {

		if (index < 0 || index >= elementCount) {
			throw new IndexOutOfBoundExceptions("IndexOutOfBoundExceptions with the index of " + index);
		}
		for (int i = size() - 1; i > index; i--) {

			objArray[i + 1] = objArray[i];
		}

		objArray[index] = object;
	}

}
