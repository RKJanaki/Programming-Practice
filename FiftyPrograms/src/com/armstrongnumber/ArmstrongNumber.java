package com.armstrongnumber;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Please enter the number");
		int n = sc .nextInt();
		int num = n, r , sum =0;
		while(n>0)
		{
			r = n % 10;
			n   = n / 10;
			sum = sum+(r*r*r);
			
		}
		if( sum == num)
		{
			System.out.println(" The given number " + num + " is an ArmstrongNumber ");
		}
		else
		{
			System.out.println(" The given number " + num + " is not an ArmstrongNumber ");
		}
		sc.close();
	}

}
