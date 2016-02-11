package com.garbagecollection;

import java.io.IOException;

public class GarbageCollectionExplicit {
	
public static void main(String[] args) throws IOException {
		
		One a = new One("white");
		One b = new One("White");
		One c = new One("White");
		a = b;
		b = c;
		c = a;
		Runtime.getRuntime().gc();
	}
}	
	
	class One{
	private String color;
	public One(String color){
		this.color = color;
	}
	
	@Override
	public void finalize(){
		System.out.println(this.color + " cleaned");
	}
	
	
	}	

