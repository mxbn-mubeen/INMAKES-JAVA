package com.codingchallenge3;

import java.util.Scanner;

public class Repeatedcharacters {
	    
	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println("enter the String:");
	        String input = s.next();
	        printRepeatedCharacters(input);
	    }
	    
	    public static void printRepeatedCharacters(String str) {
	       
	        str = str.toLowerCase();    
	       
	        int[] charCounts = new int[128];
	         
	        for (char ch : str.toCharArray()) {
	            charCounts[ch]++;
	        }
	        
	        System.out.println("Repeated characters in the string:");
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] > 1) {
	                System.out.println((char) i + ": " + charCounts[i] + " times");
	            }
	        }
	    }
	}
