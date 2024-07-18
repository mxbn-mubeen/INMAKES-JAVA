package com.userdefinedpackage.pack2.pack3;

import com.userdefinedpackage.pack1.A;
import com.userdefinedpackage.pack1.B;

public class C {
	public int c=3;
	public int get_c() {
		return c;
	}
	public void m2() {
		System.out.println("m2 in C");
		A obj1=new A();
		System.out.println(obj1.a);
		System.out.println(obj1.get_a());
		
		B obj2=new B();
		System.out.println(obj2.b);
		System.out.println(obj2.get_b());
	}
}
