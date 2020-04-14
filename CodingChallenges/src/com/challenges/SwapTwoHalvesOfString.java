package com.challenges;

public class SwapTwoHalvesOfString {

	public static void main(String[] args) {
		String str="javas";
		String swapTwoHalvesOfString = swapTwoHalvesOfString(str);
        System.out.println(swapTwoHalvesOfString);
	}

	private static String swapTwoHalvesOfString(String str) {
		
		boolean check = str.length()%2==0;
		int length=str.length()/2;
		
		if(check) {		
			String substring = str.substring(length);
			String substring2 = str.substring(0, length);
		return substring+substring2;
		}else {
			
			String substring = str.substring(length+1);
			char charAt = str.charAt(length);
			String substring2 = str.substring(0, length);
			
			return substring+charAt+substring2;
		}
	}

}
