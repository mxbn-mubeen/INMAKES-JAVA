package com.Methodreference;

public class Constructorrefrence {

	double x;
	int y;
	
	
	public Constructorrefrence(double x, int y) {
		System.out.println("method refrence to constructor reference");
		this.x = x;
		this.y = y;
		System.out.println("result="+(x+y));
	}


	public static void main(String[] args) {
		

		Constructorrefrence obj1= new Constructorrefrence(5.6,22);
		Constructorinterface obj2=Constructorrefrence::new; //method  reference to constructor
		
		obj2.add(2.8, 10);
				
	}

}
