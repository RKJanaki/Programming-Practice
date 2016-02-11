// Write a program to reverse each individual word in a sentence.


package com.reveresewords;


public class ReverseWords {
	public static void main(String[] args) {
		String s = "From the Beginning to Ending";
		String[] str = s.split(" ");
		StringBuffer sb = new StringBuffer();
		
		for(int i = str.length-1; i >=0; i--){
			sb.append(str[i]);
			sb.append(" ");
		}
			
		System.out.println("\n Original Sentence: " + s);
		System.out.println("\n Reverse word Sentence: " + sb.toString());
		
		}

}
