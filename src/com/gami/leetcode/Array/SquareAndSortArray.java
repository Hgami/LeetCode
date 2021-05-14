package com.gami.leetcode.Array;
import java.util.Arrays;

public class SquareAndSortArray {
	
	/*
	 *  Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
	 * 
	 */

	public static void main(String[] args) {
		
		int[] nums = {-4,-1,0,3,10};
	    sortedSquares(nums);
		
	}

	public static int[] sortedSquares(int[] nums) {
		int[] squareArray = new int [nums.length];
		
		for (int i = 0 ;i < nums.length ; i++) {
			squareArray[i]=getSquareOfArray(nums[i]);
		}

		Arrays.sort(squareArray);
		
		if (squareArray != null) {
			for ( int number : squareArray) {
				System.out.println(number);
			}
		 }
		return squareArray;
	        
	    }

	private static int getSquareOfArray(int number) {
		return number * number;
		
	}
}
