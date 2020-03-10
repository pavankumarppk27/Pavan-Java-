package com.generics.pracice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */

class GenericsEx<T> {

	private List<T> list;

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "GenericsEx [list=" + list + "]";
	}
	
	
	
}







public class App 
{
    public static void main( String[] args )
    {


    	
    	
    		
    		GenericsEx<Integer> ex=new GenericsEx<>();
    		
    		List<Integer> list=new ArrayList<>();
    		
    		list.add(100);
    		list.add(200);
    		
            List<Integer> list2=new ArrayList<>();
    		
    		list2.add(300);
    		list2.add(400);
    		
    		ex.setList(list);
    		ex.setList(list2);
    		
    		System.out.println("==============================");
    		
    		List<Integer> list3 = ex.getList();
    		System.out.println(list3);
    		
    		GenericsEx<String> ex2=new GenericsEx<>();
    		
    		List<String> listStr=Arrays.asList("Java","Spring","SpringBoot");
    		ex2.setList(listStr);
    		
    		
    		GenericKeyValue<Integer,String> keyVal=new GenericKeyValue<Integer, String>(101, "java");
    		
    		
    		System.out.println(keyVal.getKey());
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
}
