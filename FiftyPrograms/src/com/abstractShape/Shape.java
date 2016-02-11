/*Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) 
  and methods(calculateArea,calculatePerimeter,setSides.
*/

package com.abstractShape;

public abstract class Shape {
	
	protected int noOfSides;
	protected int lengthOfSide;
	protected double area;
	protected double perimeter;
	
	 public Shape(int noOfSides, int lengthOfSide)
	  {
	 System.out.println("constructing Shape");
	 this.noOfSides = noOfSides;
	 this.lengthOfSide=lengthOfSide;
	 }
	 public double getPerimeter()

		{
			perimeter= noOfSides*lengthOfSide;
			return perimeter;
		}
	public int getNoOfSides()
	{
		return noOfSides;
	}
	
	public abstract double getArea();
	
	}
