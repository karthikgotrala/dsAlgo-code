package com.core.java.kg.algorithms.sort.mergesort;

public class MergeSort {
	
	
	public void sort(int[] arr, int l,int r) {
		if(arr!=null && arr.length>0 && l<r) {
			
			//dividing array into two halves 
			int m=(l+r)/2;
			//sorting first and second halves in recursive calls
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	
	public void merge(int arr[],int l, int m, int r) {
		
		//Find sizes of the two sub arrays to be merged
		
		int n1=m-l+1;
		int n2=r-m;
		
		//create temp arrays
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//copy data into temp arrays
		for(int i=0;i<n1;++i) {
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;++j) {
			R[j]=arr[m+1+j];
		}
		
		//Merge the temp arrays
		
		//initial index of first and second subarrays
		int  i= 0,  j=0;
		//Initial index of merged subarray array
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i]<R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		
		//copy remaining elements of L[] if any */
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
	
	

}
