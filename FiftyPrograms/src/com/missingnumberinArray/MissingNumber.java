//Write a program to find the missing number in a series of sorted numbers stored in an array.

package com.missingnumberinArray;

public class MissingNumber {
	
	//calculating sum of numbers
	static int sumNumbers(int n)
	{
		int sum = (n*(n+1))/2;
		return sum;
	}
	
	//calculating sum of elements of array
	static int sumElements(int[] arr)
	{
		int sum = 0;
		for (int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		int n = 8;
		int[] a = {1,2,3,4,6,7,8};
		
		int sumNumbers = sumNumbers(n);
		
		int sumElements = sumElements(a);
		
		int missingNumber = sumNumbers - sumElements;
		
		System.out.println(" Missing Number in Array is: " + missingNumber);
	}

}
