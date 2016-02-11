//  Write a program to search for a string in a file and then replace it with another string.


package com.replaceStringinFile;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ReplaceStringinFile {
	
	public static void main(String[] args) {
		
		String file = "C:/Users/Bala/Desktop/Folder 1/Samp file.txt";
		FileReader fReader;
		
		try{
			fReader =new FileReader(file);
			BufferedReader read = new BufferedReader(fReader);
			//BufferedWriter write = new BufferedWriter(fwriter);
			String cursor;
			String searchword ="love";
			String replaceword ="like";
			
			while((cursor = read.readLine()) != null){
				String[] word = cursor.split(searchword);
				for(String w :word){
					if(w.replaceAll(searchword, replaceword) != null);
					w = replaceword;
					//FileWriter fWriter =new FileWriter(file);
					//fWriter.close();
				}
			}
			
			System.out.println(" In File (" +file + " ) string "+ searchword + " replaced with " + replaceword);
			read.close();
			//fWriter.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("Error occured " + e.getMessage());
		}
		}
		
	}


