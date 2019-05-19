package com.core.java.kg.sort.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		
		
		int arr[]={2,8,4,3,5,7,6};
		int n=arr.length;
		for(int i=1;i<n;i++){
			int key=arr[i];
			int j=i-1;

			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
				//printArray(arr);
			}
			arr[j+1]=key;
			//printArray(arr);
		}

		printArray(arr);

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

