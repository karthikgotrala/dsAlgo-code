package com.core.java.kg.algorithms.pigeonholesort;

import java.util.Arrays;

import com.core.java.kg.algorithms.isort.ISort;

public class PigeonholeSort implements ISort {

	@Override
	public int[] sort(int[] input) {
		
		int min=input[0];
		int max=input[0];
		int i=0;
		
		//Step 1: Find min and max value from the give array
		while(i<input.length-1) {
			if(input[i]<min) {
				min=input[i];
			}
			if(input[i]>max) {
				max=input[i];
			}
			i++;
		}
		//Step 2: Find range using formula range=max-min-1;
		int range=max-min-1;
		System.out.println(String.format("min=%s, max=%s, range=%s", min,max,range));
		
		//step 3: create an empty array with same size of range
		int[] ph=new int[range];
		
		//Step 4: fill all items with zero in the pigeion hole array
		Arrays.fill(ph,0);
		printArry(ph);
		
		return input;
	}

}
