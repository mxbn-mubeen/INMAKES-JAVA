package com.files;

import java.io.File;

public class Workingwithdirectories {

	public static void main(String[] args) {


		String directory="computer";
		File f=new File("D:\\java\\Module-3\\src\\com\\files\\"+directory); 

		if(f.mkdir()) {
			System.out.println("directory created...");
		}
		else if(f.exists()) {
			System.out.println("directory already created");
			String s[]=f.list();
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i]);
			}
		}

	}

}
