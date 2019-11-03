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
		System.out.println(String.format(" l=%s, m=%s, r=%s", l,m,r));
		int n1=m-l+1;
		System.out.println(String.format(" n1=m-l+1 ==>n1=%s-%s+1=> %s", m,l,n1));
		int n2=r-m;
		System.out.println(String.format(" n2=r-m ==>n2=%s-%s=> %s", r,m,n2));
		
		//create temp arrays
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		//copy data into temp arrays
		for(int i=0;i<n1;++i) {
			L[i]=arr[l+i];
			System.out.println(String.format("i==>%s L[i]==>%s",i,L[i]));
		}
		for(int j=0;j<n2;++j) {
			R[j]=arr[m+1+j];
			System.out.println(String.format("j==>%s R[j]==>%s",j,R[j]));
		}
		
		//Merge the temp arrays
		
		//initial index of first and second subarrays
		int  i= 0,  j=0;
		//Initial index of merged subarray array
		int k=l;
		while(i<n1 && j<n2) {
			System.out.println(String.format("i==>%s L[i]==>%s j==>%s R[j]==>%s",i,L[i],j,R[j]));
			System.out.println(String.format("L[i]<R[j]=%b",(L[i]<R[j])?true:false));
			if(L[i]<R[j]) {
				
				arr[k]=L[i];
				System.out.println(String.format("i==>%s L[i]==>%s j==>%s R[j]==>%s ==> arr[k]=%s",i,L[i],j,R[j],arr[k]));
				i++;
			}else {
				arr[k]=R[j];
				System.out.println(String.format("arr[k]=R[j]==>%s",arr[k]));
				j++;
			}
			k++;
			System.out.println(String.format("k++=>%s",k));
		}
		
		
		//copy remaining elements of L[] if any */
		while(i<n1) {
			System.out.println(String.format("i=%s,K=%s => arr[k]=L[i]<=>%s=%s",i,j, arr[k],L[i]));
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			System.out.println(String.format("j=%s,K=%s => arr[k]=R[i]<=>%s=%s",j,k, arr[k],R[j]));
			arr[k]=R[j];
			j++;
			k++;
		}
	}
	
	
	

}
