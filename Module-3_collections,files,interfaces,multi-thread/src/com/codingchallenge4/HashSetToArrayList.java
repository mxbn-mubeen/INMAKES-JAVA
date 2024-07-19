package com.codingchallenge4;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class HashSetToArrayList {

    public static void main(String[] args) {
       
        HashSet<String> hashSet = new HashSet<>();
        
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");
        
        System.out.println("HashSet: " + hashSet);
        
        List<String> arrayList = new ArrayList<>(hashSet);
       
        System.out.println("ArrayList: " + arrayList);
    }
}
