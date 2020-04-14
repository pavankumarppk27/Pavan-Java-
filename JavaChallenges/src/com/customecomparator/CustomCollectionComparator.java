package com.customecomparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomCollectionComparator {

	public static void main(String[] args) {
		
		
		Comparator<Employe> com=(emp1,emp2)->{
			
			String s=emp1.name.toLowerCase();
			String s2=emp2.name.toLowerCase();
			
			return s.compareTo(s2);
		};
		
		
		//TreeSet<Employe> ts=new TreeSet<>();
		
		Employe e1=new Employe(105,"Pavan");
		
		System.out.println(e1);
		
		
		Employe e2=new Employe(102,"kumar");
		Employe e3=new Employe(103,"ravan");
		Employe e4=new Employe(101,"javan");
		Employe e5=new Employe(104,"navan");
		
	   TreeSet<Employe> ts=new TreeSet<>(com);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		
		System.out.println(ts);

	}

	
	
	
}
