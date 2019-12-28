package com.core.java.kg.hackerank.problems.strings;

import java.util.ArrayList;
import java.util.List;

public class WeightedUniformStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q= {5,9,7,8,12,5};
		System.out.println(weightedUniformStrings("aaabbbbcccddd", q));
		
		
	}
	
	
	
	  static String[] weightedUniformStrings(String s, int[] queries) {
		 
		  List<String> uniformStr=new ArrayList<String>();
		  List<Long> uniformWeights=new ArrayList<Long>();
		  String alphabets="abcdefghijklmnopqrstuvwxyz";
		  String[] response=new String[queries.length];
		  
		  for(int i=0;i<s.length();i++) {
			  if(i==0) {
				  uniformStr.add(s.substring(i,i+1));
				  uniformWeights.add(weightedSum(s.substring(i,i+1), alphabets));
			  }else {
			  StringBuffer subUni=new StringBuffer();
			  for(int j=i;j>-1;j--) {
				  if(s.charAt(i)==s.charAt(j)) {
					  subUni.append(s.charAt(i));
					}
				 
			  }
			  uniformStr.add(subUni.toString());
			  uniformWeights.add(weightedSum(subUni.toString(), alphabets));
			  }
			  
		  }
		 // System.out.println(uniformStr.toString());
		 // System.out.println(uniformWeights.toString());
		  for(int j=0;j<queries.length;j++) {
			  if(uniformWeights.contains(Long.valueOf(queries[j]))){
				  response[j]="Yes";
			  }else {
				  response[j]="No";
			  }
		  }
		  
		  
		  return response;

	  }
	  
	  static Long weightedSum(String s, String alphabets) {
		  
		  Long weight=0L;
		  for (int i=0;i<s.length();i++) {
			  if(alphabets.indexOf(s.charAt(i))>-1){
				  weight+=(alphabets.indexOf(s.charAt(i))+1);
			  }
		  }
		 
		  return weight;
		  
	  }


}
