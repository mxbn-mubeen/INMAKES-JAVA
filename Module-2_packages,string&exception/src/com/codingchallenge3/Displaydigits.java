package com.codingchallenge3;

import java.util.Scanner;

public class Displaydigits {
    public static void main(String[] args) {
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the string:");
        String input = s.next();
        
        String output = extractDigits(input);
        System.out.println("Output: " + output);
    }

    public static String extractDigits(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
