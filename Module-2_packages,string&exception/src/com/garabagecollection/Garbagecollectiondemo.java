package com.garabagecollection;

public class Garbagecollectiondemo {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"alex",23);
		Student s2=new Student(2,"rex",23);
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1=null;//eligible for garbage collection and 1.null reference
		s1=s2;//2.Reference to another
		
		 new Student(1,"alex",23);//3.Anonymous object
		 new Student(2,"rex",23);
		
		System.gc();

	}

}
