//Write a program to perform a linear search on any given array

package com.linearsearch;

public class LinearSearch {
	
	public static int linearsearch(int[] arr,int num){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
			return i;	
			}
		}
			return -1;
	
	}
	public static void main(String[] args) {
		int[] arr = {45,26,75,11,35,18,42,66,97,38};
		int searchNum = 97;
		System.out.println(" Number " + searchNum + " is in index " + linearsearch(arr,searchNum) );
		
	}

}
