package com.codingchallenge3;

import java.util.Scanner;

public class Stringcaseconverter {

    public static void main(String[] args) {
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the string:");
        String input = s.next();
        
        String upperCase = convertToUpperCase(input);
        String lowerCase = convertToLowerCase(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }

    public static String convertToUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    public static String convertToLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }
}
