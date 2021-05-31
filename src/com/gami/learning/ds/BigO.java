package com.gami.learning.ds;

public class BigO {

	public static void main(String[] args) {
		
		int[] numbers = new int[]{1,2,3};
		String[] names = new String[]{"A","B","C"};
		
		/*
		 * 
		 * Learning different Big O notification
		 *
		 *	1)  Big O of 1  --> Constant time
		 *
		 *	2)  Big O of N 	--> Linear Approach 
		 *
		 *	3)  Big O of N^2 --> Quadratic Approach
		 *
		 *	4)  Big O of Log --> Logorathic Approach
		 *		Example : Binary Search
		 *
		 *	5) Big 0 of 2n^2 -- Exponential Growth
		 *		Opposite to Logorathmic growth
		 *
		 *
		 */
	
		
		 BigOof1(numbers);
		 BigOofN(numbers,names);
		 BigOofNSquare(numbers,names);

	}
	
	public static void BigOof1(int[] numbers) {
		
		/* Complexity is O(1) Big O of 1  --> tht is constant time. 
		 * Because it does not matter how long the input is 
		 * 
		*/	
		System.out.println(numbers[0]);
		
	}
	
	public static void BigOofN(int[] numbers, String[] names) {
		
		/* Complexity is O(N) Big O of N  --> That means it depends upon Input 
		 * 
		 * loops are considered to be O(n)
		 * 
		 * 	If there are two loops, even in that case it will be O(n)
		 * 		O( n + n ) =  O( 2n ) = O(n) 
		 *      Run time of the method increases linearly. 
		 * 
		*/	
		
		for (int nums : numbers) {
			System.out.println(nums);
		}
		
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	private static void BigOofNSquare(int[] numbers, String[] names) {
		
		/* Complexity is O(N^2) Big O of N-square 
		 * 
		 * Double Nested loops are considered to be O(n^2)
		 * 
		 *  Slower then O(n)
		 * 
		*/	
		
		
		for (int nums : numbers) { // O(n)
			for (String name : names) { // O(n)
				System.out.println(name);
				System.out.println(nums);
			
			}
		}
		
	}

}
