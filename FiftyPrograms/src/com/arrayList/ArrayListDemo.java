/*Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator.
*/
package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList <String>();
		
		list.add("Ritu");
		list.add("Ramya");
		list.add("Sita");
		list.add("Mary");
		list.add("Kristina");
		
		boolean search = list.contains("maya");
		System.out.println("Does this list contains sita? " + search);
		
		Iterator<String> ir = list.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		ListIterator<String> listIterator = list.listIterator(list.size());
		System.out.println("Elements in reverse order using ListIterator:");
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		
		
	}

}
