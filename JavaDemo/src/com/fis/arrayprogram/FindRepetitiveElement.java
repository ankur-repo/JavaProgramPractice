package com.fis.arrayprogram;

public class FindRepetitiveElement {
	 static int findRepeating(int[] arr, int n) 
	    { 
	        // Find array sum and subtract sum  
	        // first n-1 natural numbers from it  
	        // to find the result. 
	  
	        int sum = 0; 
	        for (int i = 0; i < n; i++) 
	            sum += arr[i]; 
	        System.out.println("Sum is "+sum);
	        return sum - (((n - 1) * n) / 2);  
	    } 
	  
	    // Driver code 
	    public static void main(String args[])  
	    { 
	        int[] arr = { 9, 1, 2, 6, 1, 8, 5, 3, 4, 7 }; 
	        int n = arr.length; 
	        System.out.println(findRepeating(arr, n)); 
	    } 

}
