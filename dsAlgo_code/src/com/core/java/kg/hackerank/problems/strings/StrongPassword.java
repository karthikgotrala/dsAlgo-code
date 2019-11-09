package com.core.java.kg.hackerank.problems.strings;

public class StrongPassword {

	public static void main(String[] args) {
		//System.out.println(minimumNumber(3,"Ab1"));
		//System.out.println(minimumNumber(11,"#HackerRank"));
		System.out.println(minimumNumber(4,"g1A!"));


	}

	
	
	
	static int minimumNumber(int n, String password) {
       int minChars=0;
       String numbers = "0123456789";
       String lower_case = "abcdefghijklmnopqrstuvwxyz";
       String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String special_characters = "!@#$%^&*()-+";
       int reqMin=6;
       int passWordStrength=0;
       boolean isNumExists=false;
       boolean isLowerCaseExists=false;
       boolean isUpperCaseExists=false;
       boolean isSpecialCharsExists=false;
       for(int i=0;i<n;i++) {
    	   char c=password.charAt(i);
    	   if(numbers.indexOf(c)>-1 && !isNumExists) {
    		   passWordStrength++;
    		   isNumExists=true;
    	   }
    	   if(lower_case.indexOf(c)>-1 && !isLowerCaseExists) {
    		   passWordStrength++;
    		   isLowerCaseExists=true;
    	   }
    	   if(upper_case.indexOf(c)>-1 && !isUpperCaseExists) {
    		   passWordStrength++;
    		   isUpperCaseExists=true;
    	   }
    	   if(special_characters.indexOf(c)>-1 && !isSpecialCharsExists) {
    		   passWordStrength++;
    		   isSpecialCharsExists=true;
    	   }
       }
       
       minChars=(passWordStrength<=4)?4-passWordStrength:passWordStrength;
       System.out.println("minCHars= "+minChars);
       if(n>=reqMin) {
    	   return minChars;
       }else {
    	   int diff=reqMin-n;
    	   return minChars+=(diff>minChars)?diff-minChars:0;   
       }
      // minChars+=(n>reqMin)?0:(reqMin-n);     
       
       //return minChars;

    }

}
