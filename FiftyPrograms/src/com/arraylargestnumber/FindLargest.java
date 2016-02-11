//Write a program to find the largest number in a given array.


package com.arraylargestnumber;

public class FindLargest{
	  
public static void main(String[] args){
	int[] num = {57,26,78,165,205,88,97,128};
	int largest = num[0]; // which is 57
	for(int i=1;i<num.length;i++){
		if (num[i] > largest)
			largest = num[i] ;
		}
		
		System.out.println(" Largest Number in Array: " + largest);
	
}
}