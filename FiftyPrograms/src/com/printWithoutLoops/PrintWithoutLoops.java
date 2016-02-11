  //Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.

package com.printWithoutLoops;

public class PrintWithoutLoops {
	
	static void recursive(int n)
		{
		if(n<=10){
			System.out.println(n);
			recursive(n+1);}
		}
		public static void main(String[] args) {
			recursive (1);
			
		}
	}
