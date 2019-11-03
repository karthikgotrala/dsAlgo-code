package com.ds.algo.problems;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class BirthdayCake {

	public static void main(String[] args) {
		
		int n=4;
		int[] arr= {323423422,2,323423422,323423422};
		BirthDayCake(n, arr);
		
		
	}
	
	
	public static void BirthDayCake(int n, int[] arr) {
		
		if(arr!=null && arr.length>0) {
			n=arr.length;
			int i=0;
			//Step 1: First the tallest value
			while(i<n) {
				int k=i;
				int j=i+1;
				
				while(j<n) {
					
					if(arr[j]<arr[k]) {
						k=j;
						
					}
					j++;
				}
				
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				i++;
			}
			int tallestCandle=arr[n-1];
			int counter=0;
			//Step 2: Find number of times item exists in array
			for(int l=0;l<=n-1;l++) {
				if(arr[l]==tallestCandle) {
					counter+=1;
				}
			}
			System.out.println(counter);
			
			
		}
		
	}

}
