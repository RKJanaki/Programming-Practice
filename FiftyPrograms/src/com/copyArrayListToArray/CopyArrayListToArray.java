// Write a program to copy arraylist to an array.

package com.copyArrayListToArray;

import java.util.ArrayList;

public class CopyArrayListToArray {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("Yellow");
		list.add("Pink");
		System.out.println("ArrayList "+ list);
		String[] strArr = new String[list.size()];
		list.toArray(strArr);
		System.out.println("Created Array");
		for(String str : strArr){
			System.out.println(str);
		}
	}

}
