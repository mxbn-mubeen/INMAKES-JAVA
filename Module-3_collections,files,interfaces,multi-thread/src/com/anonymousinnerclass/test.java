package com.anonymousinnerclass;

public abstract class test  {

	public static void main(String[] args) {
		//anonymous inner class
		I obj1=new I() {
			
			@Override
			public void m1() {
				System.out.println("m1 calling using anonymous inner class");
				
			}

			@Override
			public void m2() {
				System.out.println("m2 calling using anonymous inner class");
				
			}
		
		//}.m1();
		
		};
		obj1.m1();
		obj1.m2();
	}
}