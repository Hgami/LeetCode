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
		
//		int[] nums = {-4,-1,0,3,10};
//	    sortedSquares(nums);
	    
	    
        int arr[] = {6, 3, 4 , 5};
        
        segregateEvenOdd(arr);
        
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
		
	}

	private static void segregateEvenOdd(int[] arr) {
		int count = 0;
		/* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right){
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0 && left < right)
                left++;
 
            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1 && left < right)
                right--;
 
            if (left < right)
            {
                /* Swap arr[left] and arr[right]*/
                left++;
                right--;
                count+=1;
            }
            
        }
        System.out.println(count);
		
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
