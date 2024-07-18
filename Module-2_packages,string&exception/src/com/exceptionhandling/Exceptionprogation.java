package com.exceptionhandling;

public class Exceptionprogation {

	public static void main(String[] args) {
		System.out.println("main method excuted");
		m1();

	}
	static void m1() {
		System.out.println("m1 executed");
		try {
			m2();
		}
		catch(ArithmeticException e) {
			System.out.println("exception handling m1");
		}
	}
	static void m2() {
		System.out.println("m2 eecuted");
		m3();
	}
	static void m3() {
		System.out.println("m3 eecuted");
		int a=10/0; //ArithmeticException 
	}
}
