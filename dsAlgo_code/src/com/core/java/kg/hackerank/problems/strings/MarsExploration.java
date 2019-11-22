package com.core.java.kg.hackerank.problems.strings;

public class MarsExploration {

	public static void main(String[] args) {
		System.out.println(marsExploration("SOSOOSOSOSOSOSSOSOSOSOSOSOS"));

	}

	
	   static int marsExploration(String s) {
	        int begin=0;
	        int end=3;
	        int factor=3;
	        int size=s.length()/factor;
	        int counter=0;
	        String matchStr="SOS";
	        for(int i=0;i<size;i++){
	        	
	            String subStr=s.substring(begin,end);
	            counter+=checkForSOS(subStr,matchStr);
	           
	            begin+=factor;
	            end+=factor;
	        }
	        return counter;
	    }
	   
	   static int checkForSOS(String substr,String matchStr) {
		   int misMatchCounter=0;
		   for(int i=0;i<substr.length();i++) {
			   	char c=substr.charAt(i);
			   	if(substr.charAt(i)!=matchStr.charAt(i)) {
			   		misMatchCounter++;
			   	}
		   }
		   return misMatchCounter;
	   }
}
