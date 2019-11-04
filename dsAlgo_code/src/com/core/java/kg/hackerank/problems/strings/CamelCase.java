package com.core.java.kg.hackerank.problems.strings;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(camelcase("saveTheChangesInTheEditor"));
	}
	
	
	
	 static int camelcase(String s) {
		 int counter=1;
		 
		 int p1=0;
		 int p2=0;
		 while(p2<s.length()) {
			 
			 if(Character.isUpperCase(s.charAt(p2))) {
				 counter++;
			 }
			 
			 p2++;
		 }
		 return counter;

	    }

}
