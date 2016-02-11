// Write a program to find a substring in a given string and then replace it with another string.

package com.findreplacesubstring;

public class FindReplaceSubstring {
	public static void main(String[] args) {
		String str = "Hello! Have a wonderful day!";
		System.out.println("Original string: " + str);
		
		String find     = "wonderful";
		String replace  = "nice";
		int startIndexValue = 0;
		int endIndexValue   = 0;
		
		startIndexValue = str.indexOf(find);
		endIndexValue  = startIndexValue + find.length();
		
		if(startIndexValue != -1){
			str = str.substring(0, startIndexValue) + replace + str.substring(endIndexValue);
			System.out.println("Replaced String: " + str);
		}
		else{
			System.out.println("Word not found");
		}
		
		
	}

}
