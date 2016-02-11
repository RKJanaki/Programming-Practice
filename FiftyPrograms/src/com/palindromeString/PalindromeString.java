//Write a program to check for a palindrome string.

package com.palindromeString;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String s1, s2 = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s1 = sc.nextLine();
		
		for(int i=s1.length()-1; i>=0; i--)
			s2 = s2 + s1.charAt(i);
		if(s1.equals(s2))
			System.out.println("Entered string is palindrome");
		else
			System.out.println("Entered string is not palindrome");
			sc.close();
		}
	

}

