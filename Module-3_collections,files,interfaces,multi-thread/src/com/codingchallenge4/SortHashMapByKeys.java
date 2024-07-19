package com.codingchallenge4;
import java.util.*;

public class SortHashMapByKeys {

    public static void main(String[] args) {
       
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(4, "Four");
        hashMap.put(2, "Two");

        System.out.println("Original HashMap: " + hashMap);

        List<Integer> sortedKeys = new ArrayList<>(hashMap.keySet());
        Collections.sort(sortedKeys);

        LinkedHashMap<Integer, String> sortedHashMap = new LinkedHashMap<>();

        for (Integer key : sortedKeys) {
            sortedHashMap.put(key, hashMap.get(key));
        }

        System.out.println("Sorted HashMap by Keys: " + sortedHashMap);
    }
}
