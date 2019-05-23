package com.core.java.kg.algorithms.heapsort;

public class HeapSort {
	
	
	//to heapify a subtree rooted with node i which is an index in arr[] n in size of the heap
	private void heapify(int arr[], int n, int i) {
		 int largest=i;// initialize the largest as root;
		 int l=2*i+1; //left =2*i+1;
		 int r=2*i+1; //right =2*i+2;
		 
		 if(l<n && arr[l]>arr[largest]) {
			 largest=l;
		 }
		
		 if(r<n && arr[r]>arr[largest]) {
			 largest=r;
		 }
		
		 
		 if(largest!=i) {
			 int swap=arr[i];
			 arr[i]=arr[largest];
			 arr[largest]=swap;
			 
			 heapify(arr,n,largest);
		 }
	}
	
	
	public void heapSort(int arr[]) {
		
		int n=arr.length;
		//build heap (rearrange array)
		for (int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		//one by one extract an element from heap
		for (int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			//call max heapify on the reduced heap;
			heapify(arr,i,0);
		}
		
	}
	
	
	

}
