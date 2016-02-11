//Write a program to search for a string in a file and then return the count of number of occurrences of the string.


package com.countOccurenceinFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurence {
	public static void main(String[] args) {
		
		String file = "C:/Users/Bala/Desktop/Folder 1/Samp file.txt";
		FileReader fReader;
		
		try{
			fReader  = new FileReader(file);
			BufferedReader read = new BufferedReader(fReader);
			
			String cursor;
			String searchword = "awesome";
			int searchOccurence = 0;
			
			while((cursor=read.readLine()) != null){
				String[] word = cursor.split(" ");
				for(String w: word){
					if(w.equalsIgnoreCase(searchword)){
						searchOccurence++;
					}
				}
			}
			System.out.println("File (" + file + ")  has " +searchOccurence +" searchOccurence ");
			read.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		catch(IOException e){
			System.out.println("Error:" + e.getMessage());
			
		}
		
	}

}
