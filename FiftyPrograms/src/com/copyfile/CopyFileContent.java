package com.copyfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileContent {
	
	public static void main(String[] args) {
		InputStream inStream = null;
		OutputStream outStream = null;
		try{
			File file1 = new File ("C:/Users/Bala/Desktop/file1.txt");
			File file2 = new File ("C:/Users/Bala/Desktop/file2.txt");
			
			inStream = new FileInputStream(file1);
			outStream = new FileOutputStream(file2);  // for override file content
			
			byte[] buffer = new byte[1024];
			
			int length;
			while((length = inStream.read(buffer)) > 0){
				outStream.write(buffer, 0, length);
			}
			if(inStream != null)inStream.close();
			if(outStream != null)outStream.close();
			
			System.out.println("File Copied successfully");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
