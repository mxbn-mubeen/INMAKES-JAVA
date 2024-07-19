package com.interthreadcommunication;

public class Oddthread extends Thread{
	
	Printnumbers p;

	public Oddthread(Printnumbers p) {
	
		this.p = p;
	}

	@Override
	public void run() {
		int minOdd=2;
		while(minOdd<=10){
			p.printOdd(minOdd);
			minOdd+=2;
		}
	}
}
