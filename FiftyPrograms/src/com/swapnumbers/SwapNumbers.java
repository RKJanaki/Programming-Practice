//Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
// --> One Function should swap the numbers without any third new variable.
// --> Second function should swap the numbers using a third variable.


package com.swapnumbers;
//Function should swap the numbers without any third new variable.
public class SwapNumbers {
	public static void main(String[] args) {
		int a,b;
		 a = 16;
		 b = 14;
		System.out.println("Numbers before swap: a = " + a + " and b = " + b);
		
		a = a+b;  //  16+14 = a holds 30
		b = a-b;  //  30-14 = b holds 16
		a = a-b;  //  30-16 = a holds 14
		System.out.println("Numbers after swap: a = " + a + " and b = " + b);
		
//Function should swap the numbers without any third new variable.
		
		 a = 16;
		 b = 14;
		int temp;
		System.out.println("Numbers before swap: a = " + a + " and b = " + b);
		
		temp = a;    //temp holds 16
		a    = b;     // a holds 14
		b   = temp; // b holds 16
		System.out.println("Numbers after swap: a = " + a + " and b = " + b);
		 
	}

}
