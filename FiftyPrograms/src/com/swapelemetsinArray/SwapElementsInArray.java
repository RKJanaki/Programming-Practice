//Write a program to locate and swap only 2 elements which are not sorted in a given sorted array. 
//For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them as they are not as per sorted order.

package com.swapelemetsinArray;

public class SwapElementsInArray {
	public static void main(String[] args) {
		
	int[] arr = {7,34,19,26,12,40};
	System.out.println("Before Swap Elements:");
	for ( int i =0; i < arr.length; i++)
		
	    	System.out.print(   arr[i] + ",");
			System.out.println();
		
	   int swap1 = 1; // element from 2nd index
		int swap2 = 4; // element from 4th index
		int temp = arr[swap1]; // temp holds 34
	    arr[swap1] = arr[swap2]; // swap1 holds 12
	    arr[swap2] = temp;       // swap2 holds 34
	    
	    
	    System.out.println("After Swap Elements:");
       for ( int i =0; i < arr.length; i++)
	    	
	    	System.out.print(   arr[i] + ",");
	   
	    
	    }
 		
		
	}


