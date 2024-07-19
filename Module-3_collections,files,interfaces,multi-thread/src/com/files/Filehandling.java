package com.files;

import java.io.File;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) {


		// using \\ blackslash to create file in path
		
		File f=new File("D:\\java\\Module-3\\src\\com\\files\\Inamkes.txt"); 
		
		try {
			if(f.createNewFile()) {
				System.out.println("file is created.....");
				System.out.println("file name="+f.getName());
			}
			else if(f.exists()) {
				System.out.println("file already created...");
				System.out.println("is file read="+f.canRead());
				System.out.println("is file write="+f.canWrite());
				System.out.println("get file absolute path="+f.getAbsolutePath());
				System.out.println("file lenght="+f.length());
				System.out.println("file hidden?="+f.isHidden());
				System.out.println("file deleted="+f.delete());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
