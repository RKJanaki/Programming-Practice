//	program  to calculate factorial of a given number. You need to compute the factorial with one logic that
//  uses recursion and another logic without recursion.

package com.factorial;

public class Factorial {                     
						//without recursion
	int fact(int num) {                  
		int fact = num;
		for (int i = num - 1; i > 1; i--) {
			fact = fact * i;

		}
		return fact;
	}

	int recursion(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * recursion(num - 1);
		}

	}

	public static void main(String[] args) {

		Factorial f = new Factorial();

		int result1 = f.fact(5);
		int result2 = f.recursion(5);

		System.out.println(" Answer of given number factorial  is " + result1);
		System.out.println(" Answer of given number factorial using recursion is "+ result2);
	}

}
