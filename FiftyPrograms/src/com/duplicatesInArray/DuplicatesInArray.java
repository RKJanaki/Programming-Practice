//  Write a program to find duplicates in an array using set.

package com.duplicatesInArray;

import java.util.Set;
import java.util.TreeSet;

public class DuplicatesInArray {
	
	public static void main(String[] args) {
		
		Integer[] intArr = {100,125,75,100,225,275,175, 225};
		
		Set<Integer> i = new TreeSet<Integer>();
		 for(Integer in : intArr){
			 if(!i.add(in)){
				System.out.println("Duplicates in this array "+ in); 
			 }
		 }
		
		
		
	}

}
