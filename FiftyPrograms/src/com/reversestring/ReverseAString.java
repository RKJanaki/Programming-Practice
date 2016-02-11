//Write a program to reverse a string.Donot use StringBuffer/StringBuilder inbuilt reverse function.


package com.reversestring;

import java.util.Scanner;

public class ReverseAString {
	
	public static void main(String[] args) {
		String Original,Reverse = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		Original = sc.nextLine();
		
		int length = Original.length();
		for( int i = length -1; i >= 0; i--){
			Reverse = Reverse + Original.charAt(i);
		}
		System.out.println("Reversed String: " + Reverse);
	    sc.close();
	}

}