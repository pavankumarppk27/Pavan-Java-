package com.generics.pracice;

public class GenericKeyValue<K, V> {

	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "GenericKeyValue [key=" + key + ", value=" + value + "]";
	}
	public GenericKeyValue(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	

	
	
	
}
