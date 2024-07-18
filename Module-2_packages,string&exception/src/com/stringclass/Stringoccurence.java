package com.stringclass;

import java.util.Scanner;

public class Stringoccurence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next();
		
		String pi="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(pi.indexOf(c)!=-1)
				continue;
			pi+=c;
			int k=getCount(s,c);
			System.out.println(c+"="+k);
		}
	}

	static int getCount(String s, char c) {
	
		String d=s.replace(c+"", "");
		return s.length()-d.length();
		
	}

}
