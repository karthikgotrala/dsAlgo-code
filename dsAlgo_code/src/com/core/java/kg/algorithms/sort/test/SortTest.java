package com.core.java.kg.algorithms.sort.test;

import com.core.java.kg.algorithms.sort.mergesort.MergeSort;

public class SortTest {
	
	
	
	public static void main(String[] args) {
		int msarr[] = {12, 11, 13, 5, 6, 7}; 
		MergeSort ms=new MergeSort();
		ms.sort(msarr, 0, msarr.length-1);
		printArray(msarr);
		
	}
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+", ");
			if(i==arr.length-1) {
				System.out.println("----");
			}
		}
	}

	
}
