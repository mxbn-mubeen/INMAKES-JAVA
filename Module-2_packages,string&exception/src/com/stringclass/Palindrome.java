package com.stringclass;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String s;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the string:");
		s=scn.next();
		String rs=reverse(s);
		if(s.equals(rs))
			System.out.println("the given string is palindrome");
		else
			System.out.println("the give string is not palindrome");
	}
	public static String reverse(String s1) {
		String revstr="";
		int len=s1.length();
		for(int i=len-1;i>=0;i--) {
			revstr=revstr+s1.charAt(i);
		}
		return revstr;
	}

}
