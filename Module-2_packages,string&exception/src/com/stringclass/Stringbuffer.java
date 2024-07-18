package com.stringclass;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer("java is a");
		System.out.println(sbf);
		sbf.append(" programming");
		sbf.append(" language");
		System.out.println(sbf);
		sbf.insert(9, " object oriented");
		System.out.println(sbf);
		sbf.replace(26, 37, " secure");
		System.out.println(sbf);
		sbf.delete(26, 32);
		System.out.println(sbf);
		
		System.out.println(sbf.charAt(2));
	
		System.out.println(sbf.length());
		System.out.println(sbf.substring(10));
		System.out.println(sbf.substring(10, 16));
		sbf.reverse();
		System.out.println(sbf);
		
		StringBuilder sb=new StringBuilder("java is a");
		System.out.println(sb);
		sb.append(" programming");
		sb.append(" language");
		System.out.println(sb);
		
		String s1="JAVA";
		System.out.println(s1);
		

	}

}

// StringBuffer methods:
// - append(): Concatenates the specified string to the end of this StringBuffer.
// - insert(): Inserts the specified string at the specified position in this StringBuffer.
// - replace(): Replaces the characters in a substring of this StringBuffer with characters in the specified String.
// - delete(): Removes the characters in a substring of this StringBuffer.
// - charAt(): Returns the char value in this StringBuffer at the specified index.
// - length(): Returns the length (character count) of this StringBuffer.
// - substring(): Returns a new String that contains a subsequence of characters currently contained in this StringBuffer.
// - reverse(): Causes this StringBuffer to be replaced by the reverse of the sequence.

// StringBuilder methods:
// - append(): Concatenates the specified string to the end of this StringBuilder.
// (The rest of the methods for StringBuilder are similar to StringBuffer)

// String methods:
// - String s1="JAVA"; Creates a new String with value "JAVA".
// (Strings are immutable, meaning their values cannot be changed after creation)
