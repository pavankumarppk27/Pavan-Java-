package com.challenges;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindOutDuplicateStrings {

	public static void main(String[] args) {
		
		String str="first two first three two";
		Set<String> dup = findOutDuplicateStrings(str);

		System.out.println(dup);
	}

	public static Set<String> findOutDuplicateStrings(String str){
		
		Set<String> set=new LinkedHashSet<String>();
		Set<String> dup=new LinkedHashSet<String>();
		String[] split = str.split(" ");	    
		
		for(String string:split) {			
		//	boolean isAdded = set.add(string);			
			if(!set.add(string)) {
				dup.add(string);
			}
		}		
		return dup;		
	}
}
