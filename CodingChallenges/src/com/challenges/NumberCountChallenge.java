package com.challenges;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class NumberCountChallenge {

	public static void main(String[] args) {
	
		String input="222331111";
	    char[] charArray = input.toCharArray();	
	    Map<Character,Integer> map=new LinkedHashMap<>();
	    
	    for(char ch:charArray) {	    	
	    	map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
	    }	
	   
        for( Entry<Character, Integer> entrySet:map.entrySet()) {
        	System.out.println(entrySet.getKey()+"-----> "+entrySet.getValue()+" times");
        }
	}
}
