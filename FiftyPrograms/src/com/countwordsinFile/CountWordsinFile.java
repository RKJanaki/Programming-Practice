//Write a program to count the number of words in a file.

package com.countwordsinFile;

import java.util.*;
import java.io.*;

public class CountWordsinFile {

	public static void main(String[] args) throws IOException {
		
		try{
			String filename = "C:/Users/Bala/Desktop/Sample file.txt";
			
			int count = 0;
			Scanner sc = new Scanner(new File(filename));
			
			while (sc.hasNext()){
				count++;
				sc.next();
			}
			System.out.println("No of words in this file:(" + filename + "):\n" + count);
			sc.close();
		}
	catch (FileNotFoundException e){
		System.out.println("The given file is not found");
	}
	}	
	

}
