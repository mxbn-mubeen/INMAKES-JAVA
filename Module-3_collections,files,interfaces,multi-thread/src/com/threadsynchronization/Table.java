package com.threadsynchronization;

public class Table {
	
    /*public synchronized void printTable(int n) {  // synchronized method
        for (int i = 1; i<=10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(n + "*" + i + "=" + (n * i));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
	*/
	
	/* public void printTable(int n) {  // synchronized block
		 
		 synchronized(this) {
			 
			 for (int i = 1; i<=10; i++) {
		            try {
		                Thread.sleep(1000);
		                System.out.println(n + "*" + i + "=" + (n * i));
		            } catch (InterruptedException e) {
		                System.out.println(e.getMessage());
		            }
		        }
		    }
		}
} */

	public static synchronized void printTable(int n) {  // static synchronized  
		//calling with or without constructor 
		for (int i = 1; i<=10; i++) {
		    try {
		        Thread.sleep(1000);
		        System.out.println(n + "*" + i + "=" + (n * i));
		    } catch (InterruptedException e) {
		        System.out.println(e.getMessage());
		    }
		 }
	}
}




	        