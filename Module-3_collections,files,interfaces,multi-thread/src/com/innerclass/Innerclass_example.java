package com.innerclass;

class A{
	private int i;

	public A(int i) {
		
		this.i = i;
	}
	
	//inner class
	class B{
		public void display() {
			System.out.println(i);
		}
	}
	
}
public class Innerclass_example {

	public static void main(String[] args) {
		 
		A a1=new A(25);
		A.B b1=a1.new B();
		b1.display();
	}
}
