package com.core.java.kg.algorithms.isort;

public interface ISort {

	
	public int[] sort(int[] input);
	
	
	default void printArry(int[] input) {
		System.out.println("\n");
		for(int i=0;i<=input.length-1;i++){
			System.out.print(input[i]+" ");
		}
	}
	
}
