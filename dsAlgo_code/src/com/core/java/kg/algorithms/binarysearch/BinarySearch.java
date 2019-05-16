package com.core.java.kg.algorithms.binarysearch;

public class BinarySearch {

	//Assumption, array is only of int type and values are in sort order
	public static void main(String[] args) {
		
		int items[] = { 2, 3, 4, 10, 40,45,78,6756,45554 };
		int selVal=45554;
		int size=items.length-1;
		int initIdx=0;
		
		int result=recursiveBinarySearch(items,initIdx,size,selVal);
		
		if(result==-1) {
			System.out.println("Did not find the item");
		}else {
			System.out.println("found item at index="+result);
		}
		
		
		

	}
	
	public static int recursiveBinarySearch(int[] arr,int initIdx,int size,  int selVal) {
		System.out.println(String.format("%s, %s, %s ", initIdx,size,selVal));
		
		if(size>=initIdx) {
			int mid=(initIdx+size)/2;
			System.out.println(mid);
			if(arr[mid]==selVal) {
				return mid;
			}
			
			if(arr[mid]>selVal) {
				return recursiveBinarySearch(arr, initIdx, mid-1, selVal);
			}
			return recursiveBinarySearch(arr, mid+1, size, selVal);
				}
		
		return -1;
	}

}
