package com.files;

import java.io.File;
import java.io.FilenameFilter;

public class Filefilter implements FilenameFilter{

	String extension;
	
	public Filefilter(String extension) {
		
		this.extension = extension;
	}

	public static void main(String[] args) {


		File f=new File("D:\\java\\Module-3\\src\\com\\files");
		
		FilenameFilter filter=new Filefilter(".txt");
		
		String s[]=f.list(filter);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("total file="+s.length);

	}

	@Override
	public boolean accept(File f, String s) {
		
		return s.endsWith(extension);
	}

}
