package com.predefinedfunctionalinterface;

import java.util.function.Supplier;

public class Supplier_demo implements Supplier<String>{

	public static void main(String[] args) {
	

		Supplier<String> msg=new Supplier_demo();
	}

	@Override
	public String get() {
		
		return "Welcome";
	}

	
	
}
