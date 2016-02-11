package com.abstractShape;

public class Main {
	
	public static void main(String[] args) {
		double radius = 4;
		Shape circle = new Circle(radius);
		
		System.out.println("Result: Area " + circle.getArea() + 
				"\nResult: Perimeter " + circle.getPerimeter() + 
				"\nResult: NoOfSides " + circle.getNoOfSides() + "\n");
		
	}

}
