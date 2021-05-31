package com.gami.leetcode.Array;

import java.util.*;
import java.util.regex.Pattern;
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
		int[] arr = {1,2,3,4,5,6}; 
		long[] arr1 = {6,0,-1,10};
		 String s = "5F3Z-2e-9-w";
		 int k = 3; // k = 3 // k = 1 
		 
		 
	
		
	//	arr = runningSum(arr);
	//	arr = kidsWithCandies(arr, 2);
	//	arr = shuffle(arr, 3);
	//	String returnValue = solution(">");
	//	long arr2 = solution1(arr1);
	//	long arr3=solution3("xGxgFgtytyty");
	//	String arr3 = licenseKeyFormatting(s,k);
		 
		 
		 
		 
		 
		 
		 
		 
	 List<String>serialNumber = new ArrayList<String>();
		 
		 serialNumber.add("QDB2012R20B");
		 serialNumber.add("RED190250E");
		 serialNumber.add("RFV201111T");
		 serialNumber.add("TYU20121000E");
		 serialNumber.add("AAA198710B");
		 serialNumber.add("AbC200010E");
		 
		 int result = countCounterfeit(serialNumber);
		 
		
		System.out.println(result);
	}
	 

    public static int countCounterfeit(List<String> serialNumber) {
   
    int currency = 0;
    	
    	for (String serialNo : serialNumber) {
    		
		    Boolean checkSerialNumberLength = checkLength(serialNo);
		    	
		    	if (checkSerialNumberLength.booleanValue() == true) {
		    		
		    		Boolean checkFirstThreeChar = checkCharacters(serialNo);
		    		
		    			if (checkFirstThreeChar.booleanValue() == true) {
		    				
		    				Boolean checkYear = checkYearPrinter(serialNo);
		    				
		    					if (checkYear.booleanValue() == true ) {
		    						
		    						int denomination = checkDenomination(serialNo);
		    							
		    							currency+=denomination;
		    					}
		    			}
			    	
		    	}
    	}
    	return currency;
    }



	private static Boolean checkLength(String serialNo) {
		System.out.println("Checking serialNumber length : " +serialNo);
		
		int length = serialNo.length();
		
		
		if (length >= 10 && length <= 12 ) {
			return true;
		}else return false;
	}

//Take substring of first 3 chars and check if they are lower case or distinct. return false if condition fail
	
	private static Boolean checkCharacters(String serialNo) {
		System.out.println("Checking lowercase or distinct  : " +serialNo);
		
		String subSerialNo = serialNo.substring(0, 3);
		char lastCharacter = serialNo.charAt(serialNo.length() - 1);
	
        for (int i = 0; i < subSerialNo.length(); i++) {
	            for (int j = i + 1; j < subSerialNo.length(); j++) {
	                if ((subSerialNo.charAt(i) == subSerialNo.charAt(j)) || (!Pattern.matches("[A-Z]+",subSerialNo)) || (Character.isLowerCase(lastCharacter))) {
	                    return false;
	                }
            }
        }
        return true;
	}
	

	private static Boolean checkYearPrinter(String serialNo) {
		System.out.println("Checking Year  : " +serialNo);
		
		String subYear = serialNo.substring(3, 7);

		  try {
			  
			  int yearCheck = Integer.parseInt(subYear);
				
				
			  if (yearCheck>=1900 && yearCheck<=2019 ) {
					return true;
			  }else 
				  return false;
			
			  
			  } 
		  	catch (NumberFormatException e) {
		  		
			    return false;
			  }
			}
	
	
	private static int checkDenomination(String serialNo) {
		
		int validCurrency = 0;
		
		System.out.println("Checking Denomination  : " +serialNo);
		
		int[] denominationList = new int[]{10,20,50,100,200,500,1000 };
	
		
		String subDenomination = serialNo.substring(7, serialNo.length()-1);
		
		  try {
			  
			  int denomination = Integer.parseInt(subDenomination);
				
				
				for (int i : denominationList) {
					
					if (i == denomination ) {
						validCurrency +=denomination;
						return validCurrency;
					}
				}
			  
			  } 
		  	catch (NumberFormatException e) {
		  		
			    return validCurrency;
			  }

		return validCurrency;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public static int[] runningSum(int[] arr) {
	for(int i = 1; i<arr.length;i++) {
		arr[i] += arr[i-1];
	}
	return arr ;	
}

public static int[] kidsWithCandies(int[] candies, int extraCandies) {
	Arrays.sort(candies);
       for (int i = 0 ; i < candies.length ; i++){
    	   if (candies[i] + extraCandies >= candies[candies.length-1]) {
    		   candies[i] = 1;
    	   }
    	   else {
    		   candies[i] = 0;
    	   }
           
       }
        return candies;
}

public static int[] shuffle(int[] nums, int n) {
	
	int[] copyNums = nums.clone();
	int count =0;
	
	for (int i = 0; i<nums.length-1;i++) {
		if (i%2 == 0) {
			copyNums[i]=nums[count];
			count+=1;
		}else {
			copyNums[i]=nums[n];
			n+=1;
		}
	}
	
	for (int number : copyNums) {
		System.out.print(number);
	}
	/*
	 * Input: nums = [2,5,1,3,4,7], n = 3
	 * Output: [2,3,5,4,1,7] 
	 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 
	 * then the answer is [2,3,5,4,1,7].
	 */
	
	
	return nums;
	
}


public static String solution(String stringToSplit) {


	List<String> myList = new ArrayList<String>
								(Arrays.asList(stringToSplit.split("(?!^)")));
	
	
	for (int i = 0;i<myList.size();i++) {
		
		if (myList.get(i).equals(">")) {
			
			myList.add(i, "<");
			myList.add(i+1,">");
			
		}
	}
	
      for (String s : myList) {
    	  System.out.println(s);
      }
		return stringToSplit;
}

public static long solution1(long[] prices) {
	Arrays.sort(prices);
    long profit = 0;
    if (prices.length!=0){
       profit = ((prices[prices.length-1]) - (prices[prices.length-2]));
        return profit;
    }
    else{
        return profit;
    }
}

public static long solution3(String str) {
    int n = str.length();
    
     int res = 0;
  
         for(int i = 0; i < n; i++) {

             // Note : Default values in visited are false
             boolean[] visited = new boolean[256];

             for(int j = i; j < n; j++)
             {

                 // If current character is visited break the loop
                 if (visited[str.charAt(j)] == true)
                     break;

                         // Else update the result if
                         // this window is larger, and mark
                         // current character as visited.
                 else
                 {
                     res = Math.max(res, j - i + 1);
                     visited[str.charAt(j)] = true;
                 }
             }

             // Remove the first character of previous
             // window
             visited[str.charAt(i)] = false;
         }
         return res;
     }

public static String licenseKeyFormatting(String s, int k) {
    
	
	/*
	 * 
	 * 1) Create a Array -> which has all the letters without dashes
	 * 
	 * 2) check if the length of array / k = 0 ; 
	 * 	  if true --> Add a dash in middle and done with it
	 * 
	 * 3) if false --> length of array - 1 / k == 0 ; 
	 * 	  if true -- then add a dash after 1st element and then dash after all other element 
	 *    if false --> continue with length of array - 2 / k 
	 *    
	 *    
	 * 
	 */
      
    char characterArray[] = s.toCharArray();
   
    int lengthOfchar = characterArray.length;
  
    System.out.println(lengthOfchar);
    
    
    System.out.println(characterArray[4]);
    
    for (int i = 0; i<=lengthOfchar ; i++) {
    	//if (characterArray[i] == ) {
    		
    	}
  //  }
  
    
//	System.out.println();
	
    return s;
    
} 

}



	