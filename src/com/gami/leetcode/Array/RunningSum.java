package com.gami.leetcode.Array;
/*
 * 
 * 
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * 
 */
public class RunningSum {

	public static void main(String[] args) {	
		int[] arr = {1,1,1,1,1};
		
		arr = runningSum(arr);
	}
	
	
	public static int[] runningSum(int[] arr) {
		
		for(int i = 1; i<arr.length;i++) {
			
			arr[i] += arr[i-1];
			
		}
		return arr ;
		
	}
}
