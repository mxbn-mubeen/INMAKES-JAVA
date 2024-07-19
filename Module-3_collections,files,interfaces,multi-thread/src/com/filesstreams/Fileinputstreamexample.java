package com.filesstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinputstreamexample {

	/*fileoutputstream method
	 * public void read();
	 * public void read(bytes[] b);
	 * public void read(bytes[] b,int offset,int lenght);
	 */
	public static void main(String[] args) {
		
		try {
			FileInputStream f1=new FileInputStream("D:\\java\\Module-3\\src\\com\\filesstreams"
					+ "\\inmakes.txt");
			
			char x;
			try {
				 x=(char)f1.read();
				 System.out.println(x);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
