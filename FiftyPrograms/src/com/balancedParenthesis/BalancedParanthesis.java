//Write a program to check if a given string of parenthesis has balanced parenthesis or not.
//For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.

package com.balancedParenthesis;

import java.util.*;



public class BalancedParanthesis {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stk = new Stack<Integer>(); //creating stack
		System.out.println("Parenthesis Matching Test\n");
		
		System.out.println("Enter expression");
		String exp = sc.next(); 
		
		int len = exp.length();
		System.out.println("\nMatches and Mismatches:\n");
		
		for (int i = 0; i < len; i++){
			char ch = exp.charAt(i);
			if (ch == '(')
				stk.push(i);
			else if (ch == ')')
			{
				try
				{
					int p = stk.pop() + 1;
					System.out.println("')' at index "+(i+1)+" matched with ')' at index "+p);
					
				}
				catch(Exception e){
					System.out.println("')' at index "+(i+1)+" is unmatched");
				}
			}
		}
		while (!stk.isEmpty() )
			System.out.println("'(' at index "+(stk.pop() +1)+" is unmatched");
		sc.close();
		
	}

}
