//Write a program that takes input from user dynamically using below classes.
//              --> Scanner: Use this class to input 2 integer numbers and sum them.
//  			--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
//  			--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
//  			--> Console: Use this class to input 2 integer numbers and divide them.


package com.userInput;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputs  {
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws IOException {
		
		int	num1;
		int num2;
		int sum;
		int subtract;
		int multiply;
		int divide;
		System.out.println("Please enter 2 integers:");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		sum = num1 + num2;
		System.out.println("Sum = " + sum);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 integers");
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		subtract = num1-num2;
		System.out.println("Subtraction of two integers = " + subtract);
		
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter  2 integers");
		num1 =Integer.parseInt(dis.readLine());
		num2 =Integer.parseInt(dis.readLine());
		multiply = num1*num2;
		System.out.println("Multiplication of two integers = " + multiply);
		in.close();
		
		Console console = System.console();
		if(console == null){
		System.out.println("Unable to fetch console");
		System.exit(0);
		}
		System.out.println("Enter numbers");
		num1 = Integer.parseInt(console.readLine());
		num2 = Integer.parseInt(console.readLine());
		divide = num1/num2;
		System.out.println("Division of two integers = " + divide);
		}
		
		}


