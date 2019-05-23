package com.core.java.kg.algorithms.sort.test;

import com.core.java.kg.algorithms.heapsort.HeapSort;
import com.core.java.kg.algorithms.sort.mergesort.MergeSort;

public class SortTest {
	
	
	
	public static void main(String[] args) {
		int msarr[] = {12, 11, 13, 5, 6, 7}; 
		printArray(msarr,"Merge input");
		MergeSort ms=new MergeSort();
		ms.sort(msarr, 0, msarr.length-1);
		printArray(msarr,"Merge output");
		
		
		
		
		
		int hepArry[] = {12, 11, 13, 5, 6, 7}; 
		printArray(hepArry,"Heap input");
		HeapSort hs=new HeapSort();
		hs.heapSort(hepArry);
		printArray(hepArry,"Heap output");
		
	}
	
	
	public static void printArray(int[] arr, String type) {
		System.out.println("--------------"+type+"------------");
		for(int i=0;i<=arr.length-1;i++){
			System.out.print(arr[i]+", ");
			if(i==arr.length-1) {
				System.out.println("\n -------- END------------");
			}
		}
	}

	
}
