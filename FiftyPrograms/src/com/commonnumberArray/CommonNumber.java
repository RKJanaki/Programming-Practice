// Write a program to find the common number in any given two arrays.


package com.commonnumberArray;

public class CommonNumber {
	public static void main(String[] args) {
		
		int[] array1 = {12,6,5,10,8,17};
		int[] array2 = {25,16,19,2,6,11,23,31};
		
		for(int i=0;i<array1.length;i++){
			for(int j=0;j<array2.length;j++){
				if (array1[i]==array2[j]){
					System.out.println("Common Number:" + array1[i]);
				}
			}
		}
	}

}
