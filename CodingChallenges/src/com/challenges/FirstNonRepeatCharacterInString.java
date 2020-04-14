package com.challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatCharacterInString {

	public static void main(String[] args) {

    String string="PavanP";
    
    Character ch = firstNonRepeatCharacterNString(string);
    System.out.println(ch);

	}

	public static Character firstNonRepeatCharacterNString(String str) {
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		char[] charArray = str.toCharArray();
		Character chr=null;
		for(char ch:charArray) {
			
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		}	
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		for(Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()==1) {
			chr=entry.getKey();
			break;
			}
		}
		
		return chr;
	}
	
}
