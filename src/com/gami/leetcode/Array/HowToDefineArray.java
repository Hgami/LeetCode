package com.gami.leetcode.Array;

import javax.print.attribute.standard.NumberUpSupported;

//Code for creating Array. 

public class HowToDefineArray {

	 public static void main(String[] args) {
	 
		 String arrayName; 
		 
		 String[] defineArray = new String[15];
		 int[] nums = {0,1,1,5,5,5};
	
		 System.out.println(defineArray[0]);
	
		 for ( String arrayItems : defineArray) {
			 //	System.out.println(arrayItems);
		 }
		 
		 int result = printSquare(95,1);
		 System.out.println(result);
		 
		 result = findMaxConsecutiveOnes(nums);
		 System.out.println(result);
	 }
	 
	 
	 //Printing Squares through Recurtion Technique 
	 
	static public int printSquare(int squareNumber,int count){
		if (count <= 2) {
		
			//count = count + 1;
			return squareNumber * printSquare(squareNumber,++count);
		}
		else {
			return 1;
		}
	 }
	
	/*
	 * Finding consecutive 1's in Array. 
	 * nums = [5,5,5,0,1,1,1]
	 *		= [0,1,2,3,4,5]
	 *		= [1,1,1,0,1,1,0,1,1,1,1,1,1]
	 *
	 * The Most navive way, can be done using Hash Table more faster
	 */
	
	static public int findMaxConsecutiveOnes(int[] nums) {
		
		int counter = 1;
		int storeCounter = 0;
		System.out.println(nums.length);
		for (int i =0 ; i <= nums.length-1 ; i++) {
			if (i+1 > nums.length-1) {
				System.out.println("Breaking the loop");
			}
			else {
				if (nums[i] == nums[i+1] ) {
					counter = counter + 1 ;
					System.out.println(i+" counter : " +counter);
				}
				else {
					if ((storeCounter == 0) || (counter>storeCounter)) {
						storeCounter = counter;
						counter = 1;
					}
					else if (storeCounter>counter) {
						counter = 1;
					}
					
				}
			}
		}
		if (storeCounter>counter) {
			return storeCounter;
		}
		else return counter;

	}
	
	
	static public int findMaxConsecutiveOne(int[] nums) {
		
		
		/*
		 * Finding consecutive 1's in Array. 
		 * nums = [1,1,0,1,1,1]
		 *		= [0,1,2,3,4,5]
		 *		= [1,1,1,0,1,1,0,1,1,1,1,1,1]
		 *
		 *
		 */
		
		int counter = 1;
		int storeCounter = 0;
		
		for (int i = 0 ; i<nums.length; i++) {
			if (nums[i] == 1) {
				counter = counter + 1;
				i++;
			}
			else {
				storeCounter = counter;
				counter = 1;
			}
		}
		
		return 0;
	}
}
