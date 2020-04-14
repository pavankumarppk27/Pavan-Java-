package com.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindOutDuplicateValues {

	public static void main(String[] args) {

		Integer[] values = new Integer[] { 10, 20, 15, 20, 10,15, 30, 40, 10,20,10 };
		findOutDuplicates(values);
		findOutDuplicatesWithCollections(values);
	}

	private static void findOutDuplicatesWithCollections(Integer[] values) {

		
		HashSet<Integer> checkValues = new HashSet<>();
		HashSet<Integer> duplicateValues = new HashSet<>();
		
		List<Integer> check = Arrays.asList(values);
		for (Integer value : check) {

			if (checkValues.add(value)==false) {
				duplicateValues.add(value);
			} 
		}

		System.out.println(duplicateValues);
	}

	private static void findOutDuplicates(Integer[] values) {

		boolean[] isVisited = new boolean[values.length];
		
		for (int i = 0; i < values.length; i++) {
			
			if (!isVisited[i]) {
				int count = 1;
				
				for (int j = i+1; j < values.length; j++) {
					
					if (values[i] == values[j]) {
						count++;
						isVisited[j] = true;
						isVisited[i] = false;
					}
					if(count==1) {
						isVisited[i] = true;
					}
				}
			}
		}

		for(int i=0;i<values.length;i++) {
			if(!isVisited[i]) {
				//System.out.println(values[i]);
			}
		}

	}

}
