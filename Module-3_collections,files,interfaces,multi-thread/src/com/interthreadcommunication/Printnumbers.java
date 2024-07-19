package com.interthreadcommunication;
//resource
public class Printnumbers {

	Boolean flag=false;
	public synchronized void printOdd(int  number) {
		
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Odd number="+number);
		flag=true;
		notify();
	}
	
	public synchronized void printEven(int  number) {
		
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Even number="+number);
		flag=false;
		notify();
	}
}
