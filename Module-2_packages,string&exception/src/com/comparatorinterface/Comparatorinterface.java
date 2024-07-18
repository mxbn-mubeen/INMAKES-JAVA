package com.comparatorinterface;

import java.util.Arrays;
import java.util.Scanner;

public class Comparatorinterface {

    public static void main(String[] args) {
        Book[] myBook = {
                new Book("java", 400, 250.0),
                new Book("c", 470, 2500.0),
                new Book("xml", 490, 1250.0),
                new Book("sql", 500, 2540.0),
                new Book("php", 600, 2850.0)
        };

        
        Scanner s=new Scanner(System.in);
        System.out.println("sorting based on...");
        String input=s.next();
        if(input.equalsIgnoreCase("name")) {
        	Arrays.sort(myBook);//comparable
        }
        if(input.equalsIgnoreCase("page")) {
        	Arrays.sort(myBook,new  Pagecomparator());
        }
        if (input.equalsIgnoreCase("Price")) {
            Arrays.sort(myBook, new Pricecomparator());
        }

        for (int i = 0; i < myBook.length; i++)
            System.out.println(myBook[i]);
    }
}