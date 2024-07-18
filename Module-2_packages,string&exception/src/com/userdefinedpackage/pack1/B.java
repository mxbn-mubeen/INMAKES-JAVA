package com.userdefinedpackage.pack1;


public class B {
	public int b=2;
	public int get_b() {
		return b;
	}

 public void m1(){
	 System.out.println("m1 in B");
	A obj=new A();
	System.out.println(obj.a);
	System.out.println(obj.get_a());
}
}