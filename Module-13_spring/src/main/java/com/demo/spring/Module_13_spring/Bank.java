package com.demo.spring.Module_13_spring;

public class Bank {

	public Bank() {
		System.out.println("bank created");
	}
	
	public void deposit(double amount) {
		System.out.println("transaction sucess..");
		System.out.println("rupees "+ amount+" deposited");
	}
}
