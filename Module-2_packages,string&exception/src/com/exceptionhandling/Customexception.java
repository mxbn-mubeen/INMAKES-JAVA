package com.exceptionhandling;

import java.util.Scanner;

public class Customexception {

	public static void main(String[] args) {
		System.out.println("main method invoked");
		m1();

	}
	static void m1() {
		System.out.println("inside m1 method");
		try {
			System.out.println("inside try block");
			int a;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			a=s.nextInt();
		
		if(a<0)
			throw new Exception("NEGATIVE NUMBER NOT ALLOWED!!!!");
		System.out.println("a="+a);
		}
		catch(Exception e) {
			System.out.println("inside the catch block");
			System.out.println(e.getMessage());
		}
	}
}
