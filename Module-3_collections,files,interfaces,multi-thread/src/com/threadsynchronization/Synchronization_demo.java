package com.threadsynchronization;

public class Synchronization_demo {

	public static void main(String[] args) {
		
		Table t=new Table();
		
		/*Thread t1=new Thread1(t);
		Thread t2=new Thread2(t);*/
		
		Thread t1=new Thread1();
		Thread t2=new Thread2();
		
		t1.start();
		t2.start();

	}

}
