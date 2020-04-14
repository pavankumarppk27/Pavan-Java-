package com.challenges;

public class CheckPalinDromeStringOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "refer";
		
		str.startsWith("r");
		boolean checkIsStringPalinDromeOrNot = checkIsStringPalinDromeOrNot(str);

		if(checkIsStringPalinDromeOrNot) {
			System.out.println("the given String is Palindrome");
		}else {
			System.out.println("the given String is not Palindrome");
		}
	}

	private static boolean checkIsStringPalinDromeOrNot(String str) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = str.length()-1;

		while (i < j) {

			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
