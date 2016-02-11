//program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.
//You can vary the number of elements to be printed


package com.fibonacci;

public class Fibonacci {
	public static void main(String[] args) {
		int f1,f2,f3,n;
		f1=0;
		f2=1;
		for(n=0;n<15;n++)
		{
		System.out.println(f1);
		
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;	
		}
	

	   }
	

}
