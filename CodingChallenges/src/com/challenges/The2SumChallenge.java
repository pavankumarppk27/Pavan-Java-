package com.challenges;

import java.util.HashMap;
import java.util.Map;

public class The2SumChallenge {

	public static void main(String[] args) {
	
		int[] values=new int[] {-2,5,7,4,1,8,6,3};	
		int target=1;		
		int[] twoSum = getTwoSum(values,target);	
		System.out.println(twoSum[0]+"  "+twoSum[1]);
		
	}

	private static int[] getTwoSum(int[] values, int target) {
		
		Map<Integer,Integer> isVisited=new HashMap<Integer,Integer>();		
		for (int i = 0; i < values.length; i++) {

			int value = target - values[i];
			if (isVisited.containsKey(value)) {
				return new int[] { isVisited.get(value), i };
			}
			isVisited.put(values[i], i);
		}
		return new int[] {-1,-1};	
	}
	


}


