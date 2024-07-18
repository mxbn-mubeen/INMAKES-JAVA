package com.stringclass;

public class Stringclass {

    public static void main(String[] args) {
        // Strings declaration
        String s1 = "java is the Object programming Language";
        String s2 = "			python program			";
        
        // charAt() - Returns the character at the specified index
        System.out.println(s1.charAt(0));
        
        // compareTo() - Compares two strings lexicographically
        System.out.println(s1.compareTo(s2));
        
        // compareToIgnoreCase() - Compares two strings lexicographically, ignoring case differences
        System.out.println(s1.compareToIgnoreCase(s2));
        
        // contains() - Returns true if the string contains the specified sequence of characters
        System.out.println(s1.contains("x"));
        
        // startsWith() - Checks if the string starts with the specified prefix
        System.out.println(s1.startsWith("o")); // Beginning
        System.out.println(s1.startsWith("o", 10)); // Searching from specified index
        
        // endsWith() - Checks if the string ends with the specified suffix
        System.out.println(s1.endsWith("x"));
        
        // hashCode() - Returns a hash code value for the object
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
        // equals() - Compares this string to the specified object
        System.out.println(s1.equals(s2));
        
        // equalsIgnoreCase() - Compares this string to the specified object, ignoring case considerations
        System.out.println(s1.equalsIgnoreCase(s2));
        
        // getBytes() - Encodes this String into a sequence of bytes using the platform's default charset
        byte b[] = s1.getBytes(); // ASCII key code
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
        
        // getChars() - Copies characters from this string into the destination character array
        char c1[] = new char[s1.length()];
        s1.getChars(2, s1.length(), c1, 0);
        for (int i = 0; i < c1.length; i++)
            System.out.println(c1[i]);
        
        // toCharArray() - Converts this string to a new character array
        char c2[] = s1.toCharArray();
        for (int i = 0; i < c2.length; i++)
            System.out.println(c2[i]);

        // isEmpty() - Returns true if the string length is 0
        System.out.println(s2.isEmpty());
        
        // length() - Returns the length of this string
        System.out.println(s1.length());
        
        // replace() - Replaces occurrences of specified characters or strings in the string with another character or string
        System.out.println(s1.replace('a', '9'));
        System.out.println(s1.replace("a", "9"));
        
        // substring() - Returns a new string that is a substring of this string
        System.out.println(s1.substring(5));
        System.out.println(s1.substring(12, 18));
        
        // toLowerCase() - Converts all of the characters in this string to lower case
        System.out.println(s1.toLowerCase());
        
        // toUpperCase() - Converts all of the characters in this string to upper case
        System.out.println(s1.toUpperCase());
        
        // Concatenation and trimming
        System.out.println(s1 + s2);
        System.out.println(s1 + s2.trim());
        System.out.println(s1.concat(s2));
    }
}
