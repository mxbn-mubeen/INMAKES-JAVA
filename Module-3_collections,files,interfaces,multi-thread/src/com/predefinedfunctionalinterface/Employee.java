package com.predefinedfunctionalinterface;

public class Employee {

	int empid;
	String empname;
	String designation;
	double salary;
	
	
	
	public Employee(int empid, String empname, String designation, double salary) {
		
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Empolyee [empid=" + empid + ", empname=" + empname + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	
	
}
