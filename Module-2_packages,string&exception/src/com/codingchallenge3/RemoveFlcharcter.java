package com.codingchallenge3;

public class RemoveFlcharcter {
    
    public static void main(String[] args) {
        String input = "Madam";
        String result = removeFirstLastCharacter(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing first and last characters: " + result);
    }
    
    public static String removeFirstLastCharacter(String str) {
        
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }
}
