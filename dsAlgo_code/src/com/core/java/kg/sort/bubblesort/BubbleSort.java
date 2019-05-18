package com.core.java.kg.sort.bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {2,1,5,4,6,8,9,3,10,7,11};
		int n=arr.length-1;
		boolean isSwapContinue=true;
		int counter=1;
		int l=n;
		while(l>0 && isSwapContinue) {
			   isSwapContinue=false;
			   for(int i=0;i<=n;i++) {
				   int j=i+1;
				   if(n>j) {
					   if(arr[i]>arr[j]) {
						   int k=arr[i];
						   arr[i]=arr[j];
						   arr[j]=k;
						   isSwapContinue=true;
					   }
					 }
				}
			   l=l-1;
			   counter++;
			}
		 System.out.println("counter="+counter);
		 for(int i=0;i<=n;i++) {
			
			 System.out.println(arr[i]);
		 }
		}

	
}
