package com.collectionmethod;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		/*iterator methods
		 * 
		 * public boolean hasNext()
		 * public object next()
		 * public void remove()
		 */
		ArrayList a1=new ArrayList();
      
        a1.add("java");
        a1.add("c");
        a1.add("PHP");
        System.out.println("a1="+a1);
        
        Iterator itr= a1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        	itr.remove();
        }
        System.out.println("a1="+a1);

	}

}
