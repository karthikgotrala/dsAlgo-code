package com.core.java.kg.hackerank.problems.strings;

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(funnyString("abc"));
	}
	
	
	
	static String funnyString(String s) {
		String retVal="Not Funny";
		
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();
		
		for( int i=0,j=s.length()-1;i<s.length() && j>-1;i++,j--) {
			if(i+1>s.length() || j-1<0) {
				break;
			}
			int abs=Math.abs(getAsciiForChar(s.charAt(i))-getAsciiForChar(s.charAt(i+1)));
			s1.append(abs);
			
			int abs1=Math.abs(getAsciiForChar(s.charAt(j))-getAsciiForChar(s.charAt(j-1)));
			//s1.append(abs);
			s2.append(abs1);
			
		//	System.out.println(abs);
		}
		//System.out.println(s1.toString() +", "+s2.toString());
		if(s1.toString().equals(s2.toString())) {
			return "Funny";
		}
		
		
		return retVal;

    }
	
	static final int getAsciiForChar(char c) {
		return (int)c;
	}

}
