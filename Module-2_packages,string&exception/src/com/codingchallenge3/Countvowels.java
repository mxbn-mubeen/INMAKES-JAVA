package com.codingchallenge3;

import java.util.Scanner;

public class Countvowels {
    
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter the String:");
        String input = s.next();
        
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
    
    public static int countVowels(String str) {
    	
        str = str.toLowerCase();
        
        int count = 0;
        
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                count++;
            }
        }
        
        return count;
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
