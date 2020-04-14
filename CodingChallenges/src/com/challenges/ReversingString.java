package com.challenges;

public class ReversingString {

	
	public static void main(String[] args) {
		
		String str="pavan";
		String reverseString = reverseString(str);
		String reverseStringWithDefaultMethod = reverseStringWithDefaultMethod(str);
		System.out.println(reverseString+"   "+reverseStringWithDefaultMethod);
	}

	private static String reverseStringWithDefaultMethod(String str) {
				
		return new StringBuffer(str).reverse().toString();		
	}

	private static String reverseString(String str) {	
		StringBuffer sb=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {			
			sb=sb.append(str.charAt(i));
		}
		return sb.toString();
	}	
}
