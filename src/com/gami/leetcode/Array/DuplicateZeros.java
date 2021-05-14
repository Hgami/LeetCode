
package com.gami.leetcode.Array;

import java.util.Arrays;

public class DuplicateZeros {

	
	public static void main(String[] args) {
		int[] arr = {5,0,2,0,3,4,9,0,5};
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int n=3; 
		int m=3;
			
		//duplicateZeros(arr);
		merge(nums1, m, nums2, n);
	}
	
	public static void duplicateZeros(int[] arr) {
		 int possibleDups = 0;
	        int arrlength = arr.length - 1;

	    
	        for (int left = 0; left <= arrlength - possibleDups; left++) {
	        	
	        	System.out.println(left);
	        	
	            if (arr[left] == 0) {

	                if (left == arrlength - possibleDups) {
	                    arr[arrlength] = 0;
	                    arrlength = arrlength -1;
	                    break;
	                }
	                possibleDups++;
	            }
	        }

	        // Start backwards from the last element which would be part of new array.
	        int last = arrlength - possibleDups;

	        // Copy zero twice, and non zero once.
	        for (int i = last; i >= 0; i--) {
	            if (arr[i] == 0) {
	                arr[i + possibleDups] = 0;
	                possibleDups--;
	                arr[i + possibleDups] = 0;
	            } else {
	                arr[i + possibleDups] = arr[i];
	            }
	        }
	    }

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		   // Set p1 and p2 to point to the end of their respective arrays.
        int p1 = m - 1;
        int p2 = n - 1;
        
        // And move p backwards through the array, each time writing
        // the smallest value pointed at by p1 or p2.
        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1--];
            } else {
                nums1[p] = nums2[p2--];
            }
        }
    }

}
