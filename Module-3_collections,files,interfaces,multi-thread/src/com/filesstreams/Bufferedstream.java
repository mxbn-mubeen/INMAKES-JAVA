package com.filesstreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedstream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout=new FileOutputStream("D:\\java\\Module-3\\src\\com\\filesstreams\\Buffer.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			
			String msg="I love java program wriiten by bufferoutputstream";
			byte b[]=msg.getBytes();
			
			bout.write(b);
			bout.close();
			fout.close();
			
			FileInputStream fin=new FileInputStream("D:\\java\\Module-3\\src\\com\\filesstreams\\Buffer.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			
			int x;
			while((x=bin.read())!=-1) {
				
				//bin.skip(2);
				bin.mark(6);
				System.out.print((char)x);
			}
			bin.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
