package com.collectionmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listiterator {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*listiterator methods
		 * 
		 * public boolean hasNext()
		 * public object next()
		 * public void remove()
		 * 
		 * public boolean hasprevious()
		 * public object prevoius()
		 * 
		 * public void add(Object element)
		 * public void set(Object elemnt)
		 * 
		 * public int nextIndex()
		 * public int prevoiusIndex()
		 */
		
		List<Integer> a1=new ArrayList<Integer>();
      
        a1.add(25);
        a1.add(4);
        a1.add(56);
        System.out.println("a1="+a1);
        
        ListIterator itr= a1.listIterator();
        
        System.out.println("_______using hasNext method_____________");
        
        
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        System.out.println("_______using prevoius method_____________");
        
        System.out.println("a1="+a1);
        
        while(itr.hasPrevious()) {
        	System.out.println(itr.previous());
        }
        
        System.out.println("_______using remove method_____________");
        
        itr.remove();
        System.out.println("a1="+a1);
        
        /* remove method using while loop it can remove all eleme
         * nt in a1
         * while(itr.hasNext()) {
        	System.out.println(itr.next());
        	itr.remove();
        }
        System.out.println("a1="+a1);
        */
        
        System.out.println("a1="+a1);
        
        System.out.println("________using add method____________");
        
        System.out.println("a1="+a1);
        itr.add(100);
        itr.add(200);
        System.out.println("a1="+a1);
        
        System.out.println("_________using set method___________");
        
        System.out.println("a1="+a1);
        itr.next();
        itr.set(300);
       System.out.println("a1="+a1);
       
       System.out.println("_________using nextIndex method___________");
       
       System.out.println(itr.nextIndex());
       
       System.out.println("_________using prevoiusIndex method___________");
       
       itr.previous();
       System.out.println(itr.previousIndex());
       
        
        

	}

}
