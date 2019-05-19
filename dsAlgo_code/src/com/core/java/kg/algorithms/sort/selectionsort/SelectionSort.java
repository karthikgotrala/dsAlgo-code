package com.core.java.kg.algorithms.sort.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		


int arr[]= {8,2,10,7,15,3};
int n=arr.length;
int i=0;

while(i<n-1){
	 int min_index=i;
	 int j=i+1;
	 while(j<n){
		if(arr[j]<arr[min_index]){
			min_index=j;
		}
		j++;
	 }
	 
	 int k=arr[i];
	 arr[i]=k;
	 arr[i]=arr[min_index];
	 arr[min_index]=k;
	 i++;
}

	for(int l=0;l<=arr.length-1;l++) {
		System.out.println(arr[l]);
	}
	}

}
