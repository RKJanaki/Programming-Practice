 /*Write a program that is expected to throw a null pointer exception and in turn handles it 
 using try catch and finally.*/


package com.nullPointerException;

public class NullEx {
	
	static void name (String str)
	{
		try
		{
			str = str.toLowerCase();
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException Occured");
		}
		finally
		{
			System.out.println("clear ");
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		String str = null;
		NullEx.name(str);
	}

}
