package com.codingchallenge3;

public class Removeword {
    
    public static void main(String[] args) {
        String input = " java is a simple programming language";
        String wordToRemove = "simple";
        String result = removeWord(input, wordToRemove);
        System.out.println("Original String: " + input);
        System.out.println("String after removing '" + wordToRemove + "': " + result);
    }
    
    public static String removeWord(String str, String wordToRemove) {
      
        String[] words = str.split("\\s+");
        
        StringBuilder result = new StringBuilder();
     
        for (String word : words) {
            if (!word.equals(wordToRemove)) {
                result.append(word).append(" ");
            }
        }
        
        return result.toString().trim();
    }
}

