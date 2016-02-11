//  Write a program to sort a map by value

package com.sortByValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByValue {
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Books", 18);
		map.put("Notes", 23);
		map.put("Markers", 10);
		map.put("Crayons", 56);
		map.put("Boxes", 35);
		map.put("Bags", 69);
		
		Set<Entry<String,Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>()
				{
			public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2)
			{
				return (o2.getValue()).compareTo(o1.getValue());
			}
			
		} );
		for(Map.Entry<String,Integer> entry: list){
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}
				
	}

}
