//program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3"

package com.convertString;

public class ConvertString {
	String str1 = "This is nice";
	String str2 = "This1 is2 nice3";
	
		public static String ConvertString(String str1){
		
		String newstr = "";
		String[] words = str1.split(" ");
		
		for(int i= 0;i < words.length; i++){
			newstr +=  words[i] + (i + 1) + " ";
		}
		
		return newstr;
	}
		public static void main(String[] args) {
			ConvertString cs = new ConvertString();
			
	System.out.println("Converted String: " + cs.ConvertString("This is nice"));
}
	
}