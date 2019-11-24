package com.core.java.kg.hackerank.problems.strings;

import java.util.ArrayList;
import java.util.List;

public class GemStones {

	public static void main(String[] args) {
		String[] arr= {"abcdde","baccd","eeabg"};
		// TODO Auto-generated method stub
 System.out.println(gemstones(arr));
	}
	
	
	 // Complete the gemstones function below.
    static int gemstones(String[] arr) {
    	
    	int gemStones=0;
    	List<Character> chars=new ArrayList<Character>();
    	for(int i=0;i<arr.length;i++) {
    	compare(arr[i],arr,chars);
    	}
    	
    	
    	
    	
    	
    	return chars.size();

    }
    
    
    static void compare(String s, String[] arr,List<Character> chars) {
    	s=s.toLowerCase();
    	int counter=0;
    	for(int i=0;i<s.length();i++) {
    		boolean isExists=true;
    		for( int j=0;j<arr.length;j++) {
    			if(!arr[j].equalsIgnoreCase(s)) {
    				String s1=arr[j].toLowerCase();
    				if(s1.indexOf(s.charAt(i))<0) {
    					isExists=false;
    					continue;
    				}
    			}
    		}
    		if(isExists && !chars.contains(s.charAt(i))) {
    			chars.add(Character.toLowerCase(s.charAt(i)));
    			
    		}
    	}
    	
    	
    }


}
