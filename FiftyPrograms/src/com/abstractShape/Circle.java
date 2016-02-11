/* Write a program that creates a class Circle extending Shape abstract class and implementing 
   ShapeConstants interface and has following behavior.
 			--> Properties: radius.
 			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents.
*/


package com.abstractShape;

public class Circle extends Shape implements ShapeConstants{
	
	private double radius;

	
    public Circle(double radius){
    	super(0,0);
    	this.radius = radius;
    	
    }
    	
    @Override
    public double getArea()
    {
    	area = pi * Math.pow(radius, 2); 
    	return area;
    }
    @Override
    public double getPerimeter()
    {
    	perimeter = 2 * pi * radius;
    	return perimeter;
    }
    
}
