package com.core.java.kg.hackerank.problems.strings;

public class HackerrankInAString {

	public static void main(String[] args) {
		System.out.println(hackerrankInString("hereiamstackerrank"));
		System.out.println(hackerrankInString("hackerworld"));

	}
	
	 static String hackerrankInString(String s) {
		 String response="NO";
		 String match="hackerrank";
		 int prevMatchIndx=-1;
		 StringBuffer formedStr=new StringBuffer();
		 for(int i=0;i<match.length();i++) {
			 int matchIdx=matchFinder(match.charAt(i),s,prevMatchIndx);
			 if(matchIdx>-1) {
				 if(prevMatchIndx<0) {
					 prevMatchIndx= matchIdx;
					 formedStr.append(s.charAt(prevMatchIndx));
					 continue;
				 }else {
					 if(prevMatchIndx<matchIdx) {
						 prevMatchIndx= matchIdx;
						 formedStr.append(s.charAt(prevMatchIndx));
						 continue;
					 }
				 }
			 }
			 System.out.println(formedStr);
			
		 }
		 System.out.println(formedStr);
		 if(match.equalsIgnoreCase(formedStr.toString())) {
			 response="YES";
		 }
		 
		 
		 return response;

	 }
	 
	 static int matchFinder(char hChar, String givenString,int prevMatchIndx) {
		 int matchIndx=-1;
		 prevMatchIndx=(prevMatchIndx<0)?0:prevMatchIndx+1;
		 for(int i=prevMatchIndx;i<givenString.length();i++) {
			 if(hChar==givenString.charAt(i)) {
				 matchIndx=i;
				 break;
			 }
		 }
		 
		 return matchIndx;
		 
	 }

}
