package com.nestedclass;


class A{
	private static int i;

	public  A(int i) {
		
		this.i = i;
	}
	
	//inner class
	static class B{
		public void display() {
			System.out.println(i);
		}
	}
	
}
public class Nestedclass_example {

	public static void main(String[] args) {
		 
		A a1=new A(45);
		A.B b1=new A.B();//static way
		b1.display();
	}
}
