package com.wrapperclass;

public class Wrapperclass {
	
	int z;
	boolean b;
	double d;
	public static void main(String[] args) {
		int a=10;//primitive type
		int b=20;
		
		System.out.println("coverting primitive type into string");
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);
		System.out.println(s1+s2);
		
		System.out.println("converting orimitive types to wrapper class");
		Integer obj1=new Integer(25);//primitive to wrapper class object using constructor
		Integer obj2=new Integer(36);
		System.out.println(obj1+obj2);
				
		System.out.println("converting wrapper class into primitive types");
		int x=obj1.intValue();//converting wrapper class object into primitive type
		int y=obj2.intValue();
		System.out.println(x-y);
		
		System.out.println("converting string into wrapper class object");
		obj1=Integer.valueOf("1081");//string to wrapper class
		obj2=Integer.valueOf("2026");
		System.out.println(obj1*obj2);
		
		System.out.println("converting string into primitive types");
		
		x=Integer.parseInt("312");
		y=Integer.parseInt("123");
		System.out.println(x/y);
		
		Integer p=25;//auto-boxing[implicit]
		int i=(int)p;//auto-unboxing[explicit]
		System.out.println("i="+i);
		
		Wrapperclass w=new Wrapperclass();
		System.out.println(w.z);
		System.out.println(w.b);
		System.out.println(w.d);

	}

}
