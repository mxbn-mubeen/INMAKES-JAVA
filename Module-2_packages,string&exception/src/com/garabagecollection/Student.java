package com.garabagecollection;

public class Student {
	int rollno;
	String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("object garabge collected");
	}
	
}
