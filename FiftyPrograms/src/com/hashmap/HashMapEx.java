  /*Write a program having below methods.
 			--> To create a hashmap.
  			--> To search for a key in the created map and then returns its value.
*/

package com.hashmap;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		
HashMap<Integer,String> hmap = new HashMap<Integer,String>();

hmap.put(25, "Samsung");
hmap.put(40, "Apple");
hmap.put(10, "Acer");
hmap.put(30, "LG");
hmap.put(55, "Sony");

String search = hmap.get(10);
System.out.println(" key : 10, value : "+ search);
	}

}
