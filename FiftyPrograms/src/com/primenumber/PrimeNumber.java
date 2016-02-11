//program  to check if a given number is prime or not.


	package com.primenumber;

	public class PrimeNumber {
	boolean  IsPrime (int num)
	{for (int i=2; i<=num/2;i++)
		if (num % i== 0){
			return false;	
		}
	/*{for (int i=2; i<num; i++)
		if (num % i == 0){
			return false;	
		}	*/
	
	return true;
}
	public static void main(String[] args) {
	PrimeNumber prime = new PrimeNumber();	
		System.out.println(" Is this number is prime? " + prime.IsPrime(15));
	}
}