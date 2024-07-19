package com.filesstreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Bytearrayoutputstream {

	public static void main(String[] args) {
		

		String s="I am a java developer";
		
		byte b[]=s.getBytes();
		
		ByteArrayOutputStream output = new ByteArrayOutputStream();//defaultsize-32
		
		try {
			output.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		ByteArrayInputStream input = new ByteArrayInputStream(b);
		
		
		System.out.println("Available bytes="+input.available());
		
		input.read();
		input.read();
		
		System.out.println("Available bytes="+input.available());
		

		int x;
		
		while((x=input.read())!=-1) {
			
			System.out.print((char)x);
		}
		
		/*
		 * public int available();
		 * public void skip(long 1);
		 */
	}

}
