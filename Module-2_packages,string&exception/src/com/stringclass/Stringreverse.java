package com.stringclass;

public class Stringreverse {

	public static void main(String[] args) {
		String s1="java";
		reverse(s1);

	}

	private static void reverse(String s1) {
		String revstr="";
		int len=s1.length();
		for(int i=len-1;i>=0;i--) {
			revstr=revstr+s1.charAt(i);
		}
		System.out.println(revstr);
	}

}
