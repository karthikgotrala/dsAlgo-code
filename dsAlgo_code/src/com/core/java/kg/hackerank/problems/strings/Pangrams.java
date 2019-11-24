package com.core.java.kg.hackerank.problems.strings;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
		System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
	}
	
	
	  static String pangrams(String s) {
		  String alphabets="abcdefghijklmnopqrstuvwxyz";
		  boolean flag=true;
		  s=s.toLowerCase();
		  for(int i=0;i<alphabets.length();i++) {
			  char c=alphabets.charAt(i);
			  if(s.indexOf(c)<0) {
				  flag=false;
			  }
			  
		  }
		 return flag?"pangras":"not pangram";

	    }

}
