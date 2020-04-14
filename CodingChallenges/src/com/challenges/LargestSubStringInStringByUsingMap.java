package com.challenges;

import java.util.LinkedHashMap;
import java.util.Map;

public class LargestSubStringInStringByUsingMap {
	
	public static void main(String[] args) {
		
		String largestSubString=null;
		Integer length=0;
		Map<Character,Integer> map=new LinkedHashMap<>();
		String str="abbac";
		char[] charArray = str.toCharArray();
	
		for(int i=0;i<charArray.length;i++) {
			
			if(map.containsKey(charArray[i])) {
				i=map.get(charArray[i]);
				map.clear();
			}else {
				map.put(charArray[i], i);
			}
			
			if(map.size()>length) {
				largestSubString=map.keySet().toString();
				length=map.size();
			}
		}
		System.out.println(largestSubString);
	}

}
