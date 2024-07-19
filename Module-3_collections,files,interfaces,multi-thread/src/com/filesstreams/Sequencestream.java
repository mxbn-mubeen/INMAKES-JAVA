package com.filesstreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequencestream {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1=new FileInputStream("D:\\java\\Module-3\\src\\com\\filesstreams\\t1.txt");
			FileInputStream f2=new FileInputStream("D:\\java\\Module-3\\src\\com\\filesstreams\\t2.txt");
			
			SequenceInputStream input=new SequenceInputStream(f1, f2);
			
			int x;
			while((x=input.read())!=-1) {
				System.out.println((char)x);
			}
			f1.close();
			f2.close();
			input.close();
			
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
