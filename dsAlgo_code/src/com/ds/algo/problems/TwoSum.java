package com.ds.algo.problems;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
public class TwoSum {

	
	public static void main(String[] args) {
	 int[] nums= {3,2,4};
	 int target=6;
	 int[] returnVal=twoSum(nums,target);
	 System.out.println("["+returnVal[0]+","+returnVal[1]+"]");

	}
	
	
	public static int[] twoSum(int[] data, int target) {
		int[] rtArry=null;
		if(data!=null && data.length>0){
			boolean resultFound=false;
			for(int i=0;i<=data.length-1;i++) {
				for(int j=i+1;j<=data.length-1;j++) {
					if(data[i]+data[j]==target) {
						rtArry= new int[2];
						rtArry[0]=i;
						rtArry[1]=j;
						resultFound=true;
						break;
					}
					if(resultFound==true) {
						break;
					}
				}
			}
		}
		
		return rtArry;
	}

}
