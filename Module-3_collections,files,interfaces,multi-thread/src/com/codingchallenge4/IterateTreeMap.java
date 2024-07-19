package com.codingchallenge4;
import java.util.*;

public class IterateTreeMap {

    public static void main(String[] args) {
       
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
     
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");

        // Method 1: Iterate using entrySet() and enhanced for loop
        System.out.println("Iterating TreeMap using entrySet() and enhanced for loop:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Method 2: Iterate using keySet() and enhanced for loop
        System.out.println("\nIterating TreeMap using keySet() and enhanced for loop:");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // Method 3: Iterate using forEach() method and lambda expression
        System.out.println("\nIterating TreeMap using forEach() method and lambda expression:");
        treeMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}
