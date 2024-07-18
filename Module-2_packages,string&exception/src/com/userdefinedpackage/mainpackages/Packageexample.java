package com.userdefinedpackage.mainpackages;

import com.userdefinedpackage.pack1.A;
import com.userdefinedpackage.pack1.B;
import com.userdefinedpackage.pack2.pack3.C;

public class Packageexample {

	public static void main(String[] args) {
		
		A obj1=new A();
		System.out.println(obj1.a);
		
		B obj2=new B();
		System.out.println(obj2.b);
		obj2.get_b();
		obj2.m1();
		
		C obj3=new C();
		System.out.println(obj3.c);
		obj3.m2();
		
		int sum=obj1.get_a()+obj2.get_b()+obj3.get_c();
		System.out.println("sum="+sum);

	}

}
