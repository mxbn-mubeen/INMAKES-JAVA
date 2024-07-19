package com.filesstreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datastream {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int a;
		float b;
		char c;
		double d;
		boolean e;
		
		try {
			FileOutputStream f1=new FileOutputStream("D:\\java\\Module-3\\src\\com\\filesstreams\\Sample.txt");
			DataInputStream dis=new DataInputStream(System.in);
			DataOutputStream dos=new DataOutputStream(f1);
			
			System.out.println("Enter The Integer:");
			//a=dis.readInt();
			a=Integer.parseInt(dis.readLine());
			
			System.out.println("Enter The Float:");
			//b=dis.readFloat();
			b=Float.parseFloat(dis.readLine());
			
			System.out.println("Enter The Char:");
			//c=dis.readChar();
			c=dis.readLine().charAt(0);
			
			System.out.println("Enter The Double:");
			//d=dis.readDouble();
			d=Double.parseDouble(dis.readLine());
			
			System.out.println("Enter The Boolean:");
			//e=dis.readBoolean();
			e=Boolean.parseBoolean(dis.readLine());
			
			/*System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);*/
			
			dos.writeInt(a);
			dos.writeFloat(b);
			dos.writeChar(c);
			dos.writeDouble(d);
			dos.writeBoolean(e);
			
			FileInputStream f2=new FileInputStream("D:\\java\\Module-3\\src\\com\\filesstreams\\Sample.txt");
			DataInputStream dis2=new DataInputStream(f2);
		
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
