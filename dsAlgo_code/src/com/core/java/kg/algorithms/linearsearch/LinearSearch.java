package com.core.java.kg.algorithms.linearsearch;

public class LinearSearch {
	

	public static void main(String[] args) {
		
		int i[]= {1,3,4,5,6,79,232,54};
		int findI=41;
		boolean isFound=false;
		for (int j=0;j<=i.length-1;j++) {
			if(i[j]==findI) {
				System.out.println("found = "+findI+"at location= "+j);
				isFound=true;
				break;
			}
		}
		if(!isFound) {
			System.out.println(findI +" doesn't exists in the given array");
		}
		
		

	}
	

}
