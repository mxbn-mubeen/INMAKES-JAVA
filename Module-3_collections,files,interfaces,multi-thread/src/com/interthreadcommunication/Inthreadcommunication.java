package com.interthreadcommunication;

public class Inthreadcommunication {

	public static void main(String[] args) {
		
		Printnumbers p=new Printnumbers();
		Oddthread t1=new Oddthread(p);
		Eventhread t2=new Eventhread(p);
		
		t1.start();
		t2.start();
		
		
		
	}

}
