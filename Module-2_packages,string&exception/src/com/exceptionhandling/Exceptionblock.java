package com.exceptionhandling;

import java.util.Scanner;

public class Exceptionblock{

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number:");
		a=s.nextInt();
		
		System.out.println("enter the second number:");
		b=s.nextInt();
		try {
			System.out.println("inside try block");
			int c=a/b;
			System.out.println(c);
			
			int x[]= {10,20,30};
			System.out.println(x[2]);
			
			int y[]=new int[-10];
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("ArithmeticException="+e);
			System.out.println("ArithmeticException=" +e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException= "+e1);
			System.out.println("ArrayIndexOutOfBoundsException= "+e1.getMessage());
		}
		catch(NegativeArraySizeException e2) {
			System.out.println("NegativeArraySizeException= "+e2);
			System.out.println("NegativeArraySizeException= "+e2.getMessage());
		}
		finally {
			System.out.println("finally blocked invoked");
		}
	}

}
