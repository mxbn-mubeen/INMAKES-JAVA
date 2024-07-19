package com.collectionmethod;

import java.util.ArrayList;

public class Generics_demo {

	public static void main(String[] args) {
		//GEnerics introduced in jdk 1.5
		
		//in jdk 1.4 
		
		 ArrayList a1=new ArrayList();
	       
	        a1.add("java");
	        a1.add("python");
	        a1.add(new Integer(25));
	        a1.add(new Boolean(true));
	        a1.add(new Double(2.86));
	        
	        System.out.println("a1="+a1);
	        
	        //in jdk 1.5
	        ArrayList<Integer> a11=new ArrayList<Integer>();
	        
	        a11.add("java");
	        a11.add("python");
	        a11.add(25);
	        a11.add(true);
	        a11.add(2.86);
	        
	        System.out.println("a11="+a11);
	        
	        //jdk 1.7 - daimon operator introduced
	        
	        ArrayList<Integer> a111=new ArrayList<>();
	        
	        a111.add("java");
	        a111.add("python");
	        a111.add(25);
	        a111.add(true);
	        a111.add(2.86);
	        
	        System.out.println("a11="+a111);
	}

}
