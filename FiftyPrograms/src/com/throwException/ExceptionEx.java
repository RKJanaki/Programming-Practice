/*Write a program containing a function which is expected to throw any kind of exception say 
NullPointerException or ArithmeticException etc and 
then handle this function in the parent function which calls this function.
*/


package com.throwException;

public class ExceptionEx {
	
	static double divide(int num1,int num2) throws Exception{
		double result=num1/num2;
		return result;
	}
	
	public static void main(String[] args) {
		
			try
			{
			double result = divide(20,0);
			System.out.println("result= "  +result);
			}
			catch(Exception e)
			{
				System.out.println("ArithmeticException Occured");
			}
			finally
			{
				System.out.println("Result displayed");
			}
	}

}
