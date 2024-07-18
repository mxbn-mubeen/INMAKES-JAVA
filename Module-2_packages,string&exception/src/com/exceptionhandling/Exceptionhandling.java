package com.exceptionhandling;

import java.io.DataInputStream;
import java.io.IOException;

public class Exceptionhandling {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("hello");
		int a,b;
		DataInputStream dis=new DataInputStream(System.in);
		a=Integer.parseInt(dis.readLine());//IoException
		b=Integer.parseInt(dis.readLine());
		System.out.println(a);
		System.out.println(b);
		System.out.println(a/b);//arithmeticexception //10/0 cannot divide by zero
		m1();

	}
	static void m1() {
		m1();//calling m1 method //stackoverflowexception
		System.out.println("m1 method invoked");
	}

}
