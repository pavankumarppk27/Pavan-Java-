package com.challenges;

public class ReverseInteger {

	
	public static void main(String[] args) {
		
		int value=4859;
		int reverseInteger = reverseInteger(value);
		System.out.println(reverseInteger);
	}

	private static int reverseInteger(int value) {

         int reverseVal=0;
         while(value!=0) {
        	 reverseVal=reverseVal*10+value%10;
        	 value/=10;
        	 if(reverseVal>Integer.MAX_VALUE && reverseVal<Integer.MIN_VALUE)
        		 throw new RuntimeException("Number should not be out of range.");
         }
         return reverseVal;
	}
}
