package com.ds.algo.problems;

import java.math.BigInteger;

public class MinMaxSum {

	public static void main(String[] args) {
		 int[] arr= {256741038,623958417, 467905213, 714532089, 938071625};
		 
		 miniMaxSum(arr);
	}
	
	
	static void miniMaxSum(int[] arr) {
        BigInteger min=BigInteger.valueOf(0);
        BigInteger max=BigInteger.valueOf(0);
        // Step 1: Sort the input array
        if(arr!=null && arr.length>0){
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
           	
           	 arr[i]=arr[min_index];
           	 arr[min_index]=k;
           	 i++;
           }
          
    //Step2: sum the i=0 to arr.length-2 for min and i=1 to arr.length-1;
            for(int l=0;l<=arr.length-1;++l){
                if(l<arr.length-1){
                 min=min.add(BigInteger.valueOf(arr[l]));
                }
                if(l>0){
                	max= max.add(BigInteger.valueOf(arr[l]));
                }

            }



        }
        //
System.out.println(min+" "+max);



        
    }

}
