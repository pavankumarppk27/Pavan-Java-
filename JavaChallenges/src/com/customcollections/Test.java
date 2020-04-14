package com.customcollections;

public class Test {

	public static void main(String[] args) {

		CustomArray<String> customArray = new CustomArray<>();

		customArray.add("pavan");		
		customArray.add("aaa");
		customArray.add("ppp");
		customArray.add("bbb");
		
		System.out.println(customArray.size());

		customArray.insert(2, "ppk");

			
		
		
		System.out.println(customArray.get(2));

	}

}
