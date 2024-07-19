package com.codingchallenge4;

import java.util.LinkedList;

public class Inserlinkedlist {

    public static void main(String[] args) {
       
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        System.out.println("Original LinkedList: " + linkedList);

       
        int indexToInsert = 2;
        String elementToInsert = "Grapes";
        
        if (indexToInsert >= 0 && indexToInsert <= linkedList.size()) {
            linkedList.add(indexToInsert, elementToInsert);
            System.out.println("Element '" + elementToInsert + "' inserted at position " + indexToInsert + ": " + linkedList);
        } else {
            System.out.println("Invalid index. Insertion failed.");
        }
    }
}
