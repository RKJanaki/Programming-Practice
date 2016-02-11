 /*Write a program that contains a constructor, a static block and a static method. 
Execute the program in order to verify the order to execution of methods and block.*/

package com.methodsBlocks;

public class MethodsBlocks {
	static int num;
	static String mystr;
	
	public MethodsBlocks(){   //constructor
		
		System.out.println("Default constructor");
	}
	
	
	static{             //static method
	      num = 97;
	      mystr = "Static keyword in Java";
	   }
	public static void main(String args[])      // It's a static method
	   {
		new MethodsBlocks();
		
	    System.out.println("Value of num="+num);
	    System.out.println("Value of mystr="+mystr);
	   }
	
}
