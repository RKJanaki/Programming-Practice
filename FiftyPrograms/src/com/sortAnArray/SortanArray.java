//Write a program to sort an array.

package com.sortAnArray;

public class SortanArray {
	public static void main(String[] args) {
		
		int[] arr = {16,7,11,65,43,20,37,87,55};
		
		for (int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			
				if(arr[i]>arr[j]){
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					}
				}
			}
		for(int i=0;i<arr.length;i++)
			
			System.out.println("arr["+i+"]=" + arr[i]);
	}

}
