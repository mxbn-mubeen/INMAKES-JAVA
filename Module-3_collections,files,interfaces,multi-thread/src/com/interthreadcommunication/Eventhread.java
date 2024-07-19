package com.interthreadcommunication;

public class Eventhread extends Thread{
	
	Printnumbers p;

	public Eventhread(Printnumbers p) {
	
		this.p = p;
	}

	@Override
	public void run() {
		int minEven=2;
		while(minEven<=10){
			p.printEven(minEven);
			minEven+=2;
		}
	}
}
