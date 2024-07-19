package com.codingchallenge4;
import java.util.ArrayList;

public class ArrayListIsEmpty {

    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<>();

        
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}
