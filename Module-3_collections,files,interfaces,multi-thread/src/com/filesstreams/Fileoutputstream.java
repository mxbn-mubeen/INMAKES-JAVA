package com.filesstreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputstream {

	/*fileoutputstream method
	 * public void write(int b);
	 * public void write(bytes[] b);
	 * public void write(bytes[] b,int offset,int lenght);
	 * public void close();
	 */
	public static void main(String[] args) {
		
		try {
			FileOutputStream f1=new FileOutputStream("D:\\java\\Module-3\\src\\com\\filesstreams"
					+ "\\inmakes.txt");
			
			int x=65;
			f1.write(x);//ASCII CODE
			
			
			String s="I am a Java developer";
			byte []b=s.getBytes();
			f1.write(b);
			
			f1.write(b,7,4);
			f1.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}

	}

}
