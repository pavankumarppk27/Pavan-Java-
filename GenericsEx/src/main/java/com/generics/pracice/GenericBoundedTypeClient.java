package com.generics.pracice;

public class GenericBoundedTypeClient {

	
	public static void main(String[] args) {
		
		Integer [] i= {10,20,30,40,50};			
		GenericBoundedType gbt=new GenericBoundedType(i);
		System.out.println(gbt.getAvg());
		
		Long[] l= {11l,22l,44l};
		GenericBoundedType gbt2=new GenericBoundedType(l);
        System.out.println(gbt2.getAvg());
        
        int count = getCount(i,20);
        
        System.out.println(count);
        
 	}
	
	 public static  <T extends Comparable<T>> int getCount(T[] arr,T val) {
     	
     	int count=0;
     	for(T t:arr) {
     		if(t.compareTo(val)>0) {
     			count++;
     		}    		
     	}
     	return count;
     }
     

	
	
}
