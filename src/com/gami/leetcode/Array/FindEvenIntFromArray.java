package com.gami.leetcode.Array;

//Find Numbers with Even Number of Digits

public class FindEvenIntFromArray {

	public static void main (String args[]) {
		
		int[] nums = {0};
		
		//System.out.println(findNumbers(nums));		
		//System.out.println(findEvenDigitNumber(nums));
		System.out.println(findEvenNumbers(nums));
	}



//Getting total Even Numbers in a list
static int findNumbers(int[] nums) {
	
	int count = 0;
	if (nums.length != 0) {
		
		for (int i = 0 ; i < nums.length ; i++) {
			if (nums[i]%2 == 0) {
				count+=1 ;
			}
		}
		
		return count;
	}
	else return count;
		
}



/*
 *  Find which number have even number of digits
 *  nums = [0,1,12,345,2,6,7896]
 *  nums = []
 *  nums = [1]
]
 */

public static int findEvenNumbers(int[] nums) {
    int result = 0;
    for(int num:nums){
        int len = String.valueOf(num).length();
        if(len % 2 == 0){
            result++;
        }
    }
    System.gc();
    return result;
}

private static int findEvenDigitNumber(int[] nums) {
	
	int digitCounts = 0;
	if(nums.length !=0){
	
		for (int i = 0 ; i< nums.length; i++) {
			
			System.out.println(String.valueOf(nums[i]).length()); //--> This will convert int to String, so it will be "12" and length will be 2.
			
			int digitNumber = findEvenOddDigits(nums[i]);
			
			if (digitNumber%2 == 0) {
					digitCounts+=1;
				}
		 }
	}
	
	return digitCounts;
	
	}



private static int findEvenOddDigits(int i) {

	int count = 0;
	
	if (i == 0 ) {
		return 1;
	}
	
	else {	
		while (i!=0) {
		
			i = i/10;
		
			count+=1;
		}
	}
	
	return count;
	
	}



}