package com.generics.pracice;

public class GenericMethodClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] intValues = { 1, 2, 3, 4, 5, 6 };

		GenericMethod<Integer> intVal = new GenericMethod<>(intValues);
		
	
		//intVal.setArr(intValues);

		Integer[] arr = intVal.getArr();
		System.out.println(arr[3]);

		String[] strValues= {"A","B","C","D"};
		GenericMethod<String> intVal2 = new GenericMethod<>(strValues);
		String[] arr2 = intVal2.getArr();
		System.out.println(arr2[2]);
		
		
		NonGenericMethod nonGen=new NonGenericMethod();
		
		nonGen.getElements(intValues);
		

	}

}
