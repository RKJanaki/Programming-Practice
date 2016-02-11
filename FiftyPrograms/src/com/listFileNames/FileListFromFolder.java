// Write a program to show list of all file names in a folder.

package com.listFileNames;

import java.io.File;

public class FileListFromFolder {
	public static void main(String[] args) {
		File f = new File("C:/Users/Bala/Desktop/Folder 1");
		String[] filelist = f.list(); // list of files from folder
		for(String name: filelist){
			System.out.println(name);
		}
	}

}
