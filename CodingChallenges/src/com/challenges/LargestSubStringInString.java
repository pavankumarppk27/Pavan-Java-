package com.challenges;

import java.util.ArrayList;

public class LargestSubStringInString {

	public static void main(String[] args) {

		String str = "abaceadafg";
		findTheLargestPalindrome(str);
		}

	private static void findTheLargestPalindrome(String str) {

		String string = "";
		String string2 = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			string = "" + str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				count++;
				if (string.contains(str.charAt(j) + "")) {
					break;
				}
				string = string + "" + str.charAt(j);
			}
			if (string.length() >string2.length()) {
				string2 = string;
			}
		}
		System.out.println(count);
		System.out.println(string2);
		
		ArrayList al=new ArrayList();
	}
	
	

}
